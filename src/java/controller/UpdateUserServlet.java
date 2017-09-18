/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author nguye
 */
@WebServlet(name = "UpdateUserServlet", urlPatterns = {"/UpdateUserServlet"})
public class UpdateUserServlet extends HttpServlet {
    UserDAO userDAO = new UserDAO();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String description = request.getParameter("description");
        String role = request.getParameter("role");
        String url = "", error = "";
        String message = "";
        if (name.equals("")) {
            error += "Vui lòng nhập vào tên người dùng\n";
        }
        if(description.equals("")) {
            error += "\nVui lòng nhập vào mô tả người dùng";
        }
        
        if(password.equals("")) {
            String idUser = request.getParameter("user_id");
            int id = Integer.valueOf(idUser);
            password = userDAO.getUserWhereID(id).getPassword();
        }
        
        if(role.equals("")) {
            role = "2";
        }
        try {
            if (error.length() == 0) {
                String idUser = request.getParameter("user_id");
                int id = Integer.valueOf(idUser);
                userDAO.updateUser(new User(name,password, description, Integer.parseInt(role)), id);
                url = "/admin/list-user.jsp";
                message = "Cập nhật người dùng thành công";
                request.setAttribute("message", message);
            } else {
                request.setAttribute("error", error);
                request.setAttribute("name", name);
                request.setAttribute("role", role);
                request.setAttribute("description", description);
                url = "/admin/update-user.jsp";
            }
        } catch (Exception e) {

        }
        request.getRequestDispatcher(url).forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateUserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateUserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
