/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import model.User;
import connect.DBConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author nguye
 */
public class UserDAO {
    public ArrayList<User> getListUser() throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM user";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<User> list = new ArrayList<>();
        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            user.setDescription(rs.getString("description"));
            user.setRole(rs.getInt("role"));
            list.add(user);
        }
        return list;
    }
    
    public boolean checkUser(String name, String password) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM user where name = '" + name + "' and password = '" + password + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            return true;
        }
        return false;
    }
    
    public User getUserWhereID(int id) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM user where id = " + id;
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        User user = new User();
        while(rs.next()) {
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            user.setDescription(rs.getString("description"));
            user.setRole(rs.getInt("role"));
        }
        return user;
    }

    public boolean insertUser(User u) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "INSERT INTO user value(NULL,?,?,?,?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setString(1, u.getName());
        ps.setString(2, u.getPassword());
        ps.setString(3, u.getDescription());
        ps.setInt(4, u.getRole());
        return ps.executeUpdate() == 1;
    }

    public boolean updateUser(User u,int id) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "UPDATE user SET name = ?, password = ?, description = ?, role = ? WHERE id = ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setString(1, u.getName());
        ps.setString(2, u.getPassword());
        ps.setString(3, u.getDescription());
        ps.setInt(4, u.getRole());
        ps.setInt(5, id);
        return ps.executeUpdate() == 1;
    }

    public boolean deleteUser(int id) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "DELETE FROM user WHERE id = ?";

        PreparedStatement ps = connection.prepareCall(sql);
        ps.setInt(1, id);
        return ps.executeUpdate() == 1;
    }
    
    public static void main(String[] args) throws SQLException {
        UserDAO userDAO = new UserDAO();
        System.out.println(userDAO.checkUser("nguyenvohoangduy", "123123"));
    }
}
