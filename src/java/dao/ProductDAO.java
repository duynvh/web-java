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
import model.Product;
/**
 *
 * @author nguye
 */
public class ProductDAO {
    public ArrayList<Product> getListProduct() throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM product";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while (rs.next()) {
            Product product = new Product();
            product.setId(rs.getInt("id"));
            product.setCategory_id(rs.getInt("category_id"));
            product.setPrice(rs.getInt("price"));
            product.setName(rs.getString("name"));
            product.setImage(rs.getString("image"));
            product.setDescription(rs.getString("description"));
            list.add(product);
        }
        return list;
    }
    
    public Product getProductWhereID(int id) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM product where id = " + id;
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Product product = new Product();
        while(rs.next()) {
            product.setId(rs.getInt("id"));
            product.setPrice(rs.getInt("price"));
            product.setName(rs.getString("name"));
            product.setCategory_id(rs.getInt("category_id"));
            product.setImage(rs.getString("image"));
            product.setDescription(rs.getString("description"));
        }
        return product;
    }
    
    public String getNameCategoryWhereCategoryID(int id) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM category where id = " + id;
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        String name = "";
        while(rs.next()) {
            name = rs.getString("name");
        }
        return name;
    }
    
    public boolean insertProduct(Product p) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "INSERT INTO product value(NULL,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setString(1, p.getName());
        ps.setInt(2, p.getCategory_id());
        ps.setString(3, p.getImage());
        ps.setInt(4, p.getPrice());
        ps.setString(5, p.getDescription());
        return ps.executeUpdate() == 1;
    }

    public boolean updateProduct(Product p,int id) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "UPDATE product SET name = ?, category_id = ?, image = ?, price = ?, description = ? WHERE id = ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setString(1, p.getName());
        ps.setInt(2, p.getCategory_id());
        ps.setString(3, p.getImage());
        ps.setInt(4, p.getPrice());
        ps.setString(5, p.getDescription());
        ps.setInt(6, id);
        return ps.executeUpdate() == 1;
    }

    public boolean deleteProduct(int id) throws SQLException {
        Connection connection = DBConnect.getConnection();
        String sql = "DELETE FROM product WHERE id = ?";

        PreparedStatement ps = connection.prepareCall(sql);
        ps.setInt(1, id);
        return ps.executeUpdate() == 1;
    }
    
    public static void main(String[] args) throws SQLException {
//        ProductDAO dao = new ProductDAO();
//        System.out.println(dao.updateProduct(new Product(1, 4, "Samsung S8.1", "S8.jpg", "SAMSUNG S*"), 50));
    }
}
