/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Utils.MySQL_Driver;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinhd
 */
public class ProductDAO {
    private static final Statement statement = null;
    private static MySQL_Driver db = new MySQL_Driver();
    private static Connection connect = null;
    private static ArrayList<Product> products=null;
    private static PreparedStatement preparedStatement;
    
    public static List<Product> getProductbyCateId(Integer cate_id, Integer limit, Integer offset) throws ClassNotFoundException {
        try {
            products=new ArrayList<Product>();
            connect = db.connect();
            
            if (cate_id == 0) {
                preparedStatement = connect
                        .prepareStatement("SELECT * FROM products limit ? offset ?");
                preparedStatement.setInt(1, limit);
                preparedStatement.setInt(2, offset);
            } else {
                preparedStatement = connect
                        .prepareStatement("SELECT * FROM products where cate_id = ? limit ? offset ?");
                preparedStatement.setInt(1, cate_id);
                preparedStatement.setInt(2, limit);
                preparedStatement.setInt(3, offset);
                
            }
                
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                    Product product = new Product();
                    product.setProduct_name(rs.getString("product_name"));
                    product.setProduct_desc(rs.getString("product_desc"));
                    product.setPrice(rs.getInt("price"));
                    product.setQuantities(rs.getInt("quantities"));
                    product.setSize(rs.getString("size"));
                    product.setImg_url(rs.getString("img_url"));
                    
                    products.add(product);

            }
            
            
            return products;
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    public static Integer getTotalProductCountInCategory(Integer cate_id) throws ClassNotFoundException {
        Integer count = 0;
        try {
            
            connect = db.connect();

            if (cate_id == 0) {
                preparedStatement = connect
                        .prepareStatement("SELECT count(1) quantities FROM products ");
            } else {
                preparedStatement = connect
                        .prepareStatement("SELECT count(1) quantities FROM products where cate_id = ?");
                preparedStatement.setInt(1, cate_id);
            }
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                    count = rs.getInt("quantities");
            }
            return count;
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
