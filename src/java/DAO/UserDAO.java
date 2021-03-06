/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.User;
import Utils.MySQL_Driver;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author vinhd
 */
public class UserDAO {
    private static final Statement statement = null;
    private static final PreparedStatement preparedStatement = null;
    private static MySQL_Driver db = new MySQL_Driver();
    private static Connection connect = null;
    
    
    public static int addCustomer(User user) throws SQLException, ClassNotFoundException
    {
        int status = 0;
        try
        {
            connect = db.connect();

            PreparedStatement preparedStatement = connect
                        .prepareStatement("INSERT INTO customers (username, password, full_name, mobile_phone, email, gender, date_of_birth, status) values (?, ?, ?, ?, ? , ?, ?, ?)");
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFullname());
            preparedStatement.setString(4, user.getMobile_phone());
            preparedStatement.setString(5, user.getEmail());
            preparedStatement.setInt(6, user.getGender());
            preparedStatement.setString(7, user.getDate_of_birth());
            preparedStatement.setInt(8, 0);
            preparedStatement.execute();
            status = 1;
        } catch (Exception e) {
            throw e;
        } finally {
            connect.close();
        }
        
        return status;
    }
    
    public static Boolean verifyStatus(String username) throws Exception {
        Boolean status = false;
        try
        {
            connect = db.connect();

            PreparedStatement preparedStatement = connect
                        .prepareStatement("UPDATE customers SET status = ? WHERE username = ?");
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, username);
            
            preparedStatement.execute();
            status = true;
        } catch (Exception e) {
            throw e;
        } finally {
            connect.close();
        }
        
        return status;
    }
    
    public static Boolean update(User user) throws Exception {
        Boolean status = false;
        try
        {
            connect = db.connect();

            PreparedStatement preparedStatement = connect
                        .prepareStatement("UPDATE customers SET full_name = ?, mobile_phone = ?, gender = ?, date_of_birth = ? WHERE username = ?");
            preparedStatement.setString(1, user.getFullname());
            preparedStatement.setString(2, user.getMobile_phone());
            preparedStatement.setInt(3, user.getGender());
            preparedStatement.setString(4, user.getDate_of_birth());
            preparedStatement.setString(5, user.getUsername());
            
            preparedStatement.execute();
            status = true;
        } catch (Exception e) {
            throw e;
        } finally {
            connect.close();
        }
        
        return status;
    }
    
    public static User validate(String username, String password) throws Exception{

        try
        {
            connect = db.connect();

            PreparedStatement preparedStatement = connect
                        .prepareStatement(  
            "select * from customers where username=? and password=? and status = 1");  
            preparedStatement.setString(1,username);  
            preparedStatement.setString(2,password);  
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setUser_id(rs.getString("customer_id"));
                user.setUsername(rs.getString("username"));
                user.setFullname(rs.getString("full_name"));
                user.setMobile_phone(rs.getString("mobile_phone"));
                user.setEmail(rs.getString("email"));
                user.setGender(rs.getInt("gender"));
                user.setDate_of_birth(rs.getString("date_of_birth"));
                
                return user;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            connect.close();
        }
        
        return null;
    }
    
    public static User getUserInfos(String username) throws Exception{

        try
        {
            connect = db.connect();

            PreparedStatement preparedStatement = connect
                        .prepareStatement(  
            "select * from customers where username=? and status = 1");  
            preparedStatement.setString(1,username);  
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setFullname(rs.getString("full_name"));
                user.setMobile_phone(rs.getString("mobile_phone"));
                user.setEmail(rs.getString("email"));
                user.setGender(rs.getInt("gender"));
                user.setDate_of_birth(rs.getString("date_of_birth"));
                
                return user;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            connect.close();
        }
        
        return null;
    }
    
    public static User checkDataExisted(String username, String email) throws Exception{
        try
        {
            connect = db.connect();

            PreparedStatement preparedStatement = connect
                        .prepareStatement(  
            "select username, email from customers where username=? or email = ?");  
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,email);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setEmail(rs.getString("email"));
                return user;
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw e;
        } finally {
            connect.close();
        }
        
        return null;
    }
    
}
