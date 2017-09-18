/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Category;

/**
 *
 * @author nguye
 */
public class CategoryDAO {

    public ArrayList<Category> getListCategory() throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM category";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Category> list = new ArrayList<>();
        while (rs.next()) {
            Category category = new Category();
            category.setId(rs.getInt("id"));
            category.setName(rs.getString("name"));
            category.setDescription(rs.getString("description"));
            list.add(category);
        }
        return list;
    }

    public Category getCategoryWhereID(int id) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM category where id = " + id;
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Category category = new Category();
        while(rs.next()) {
            category.setId(rs.getInt("id"));
            category.setName(rs.getString("name"));
            category.setDescription(rs.getString("description"));
        }
        return category;
    }
    
    public boolean insertCategory(Category c) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "INSERT INTO category value(NULL,?,?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setString(1, c.getName());
        ps.setString(2, c.getDescription());
        return ps.executeUpdate() == 1;
    }

    public boolean updateCategory(Category c,int id) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "UPDATE category SET name = ?, description = ? WHERE id = ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setString(1, c.getName());
        ps.setString(2, c.getDescription());
        ps.setInt(3, id);
        return ps.executeUpdate() == 1;
    }

    public boolean deleteCategory(int id) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "DELETE FROM category WHERE id = ?";

        PreparedStatement ps = connection.prepareCall(sql);
        ps.setInt(1, id);
        return ps.executeUpdate() == 1;
    }

    public static void main(String[] args) throws SQLException {
        CategoryDAO dao = new CategoryDAO();
        System.out.println(dao.insertCategory(new Category("Microsoft", "Window Phone")));
    }
}
