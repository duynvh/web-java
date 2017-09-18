/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AddUserServlet", urlPatterns = {"/AddUserServlet"})
public class AddUserServlet extends HttpServlet {
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
            throws ServletException, IOException {
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
        
        if (password.equals("")) {
            error += "Vui lòng nhập vào mật khẩu\n";
        }
        
        if(description.equals("")) {
            error += "\nVui lòng nhập vào mô tả người dùng";
        }
        
        if(role.equals("")) {
            role = "2";
        }
        try {
            if (error.length() == 0) {
                userDAO.insertUser(new User(name,password, description, Integer.parseInt(role)));
                url = "/admin/list-user.jsp";
                message = "Thêm người dùng thành công";
                request.setAttribute("message", message);
            } else {
                request.setAttribute("error", error);
                request.setAttribute("name", name);
                request.setAttribute("description", description);
                url = "/admin/insert-user.jsp";
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
        processRequest(request, response);
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
        processRequest(request, response);
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
