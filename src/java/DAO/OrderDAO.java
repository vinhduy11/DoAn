/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Item;
import Models.Order;
import Models.Product;
import Utils.MySQL_Driver;
import com.sun.corba.se.spi.presentation.rmi.StubAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author vinhd
 */
public class OrderDAO {
    private static final Statement statement = null;
    private static MySQL_Driver db = new MySQL_Driver();
    private static Connection connect = null;
    private static ArrayList<Order> orders=null;
    private static PreparedStatement preparedStatement;
    
    public static Order getLastOrderId() throws ClassNotFoundException {
        Order order=null;
        try {
            connect = db.connect();
            
            preparedStatement = connect
                        .prepareStatement("SELECT max(order_id) id FROM orders");
                
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                    order = new Order();
                    order.setId(rs.getLong("id"));
            }
            
            
            return order;
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    public static boolean addOrder(Order order, Map<String, Item> items) throws SQLException, ClassNotFoundException
    {
        try
        {
            PreparedStatement preparedStatement;
            connect = db.connect();
            Integer total = 0;
            preparedStatement = connect
                        .prepareStatement("INSERT INTO orders (order_id, customer_id, status, total) values (?, ?, ?, ?)");
            preparedStatement.setLong(1,order.getId());
            preparedStatement.setInt(2, order.getCustomer_id());
            preparedStatement.setInt(3, order.getStatus());
            preparedStatement.setInt(4, order.getTotal());
            preparedStatement.execute();
            preparedStatement.close();
            
            preparedStatement = connect
                        .prepareStatement("INSERT INTO order_items (order_id, product_id, quantity) values (?, ?, ?)");
            for (String key: items.keySet()) {
                preparedStatement.setLong(1, items.get(key).getOrderId());
                preparedStatement.setInt(2, items.get(key).getProduct().getProduct_id());
                preparedStatement.setInt(3, items.get(key).getQuantity());
                preparedStatement.execute();
            }
            
            
            return true;
        } catch (Exception e) {
            throw e;
        } finally {
            connect.close();
        }
    }
    
    public static boolean updatePaymentStatus(Order order) throws Exception {
        try
        {
            PreparedStatement preparedStatement;
            connect = db.connect();
            preparedStatement = connect
                        .prepareStatement("UPDATE orders SET status = ?, payment_id = ?  WHERE order_id = ?");
            preparedStatement.setInt(1,order.getStatus());
            preparedStatement.setString(2,order.getPayment_id());
            preparedStatement.setLong(3,order.getId());
            preparedStatement.execute();
            
            return true;
        } catch (Exception e) {
            throw e;
        } finally {
            connect.close();
        }
    }
}
