/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author nguye
 */
public class DBConnect {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_mobile", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
