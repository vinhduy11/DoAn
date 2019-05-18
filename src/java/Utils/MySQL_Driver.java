/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author vinhd
 */
public class MySQL_Driver {
    private String host="localhost";
    private Integer port=3306;
    private String username="root";
    private String password="";
    private String database="store";
    
    
    private Connection connect = null;
    
    public Connection connect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String myUrl = "jdbc:mysql://"+host+"/"+database+"?"
                            + "user="+username+"&password="+password;
        try {
            connect = DriverManager.getConnection(myUrl);
        } catch (Exception e)
        {
            throw e;
        }
        
        return connect;
    }
    
    public void close() throws Exception {
        try {
            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
}
