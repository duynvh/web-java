/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.Product;

/**
 *
 * @author nguye
 */
@WebServlet(name = "AddProductServlet", urlPatterns = {"/AddProductServlet"})
@MultipartConfig
public class AddProductServlet extends HttpServlet {

    ProductDAO productDAO = new ProductDAO();
    private static final long serialVersionUID = 1L;
    // location to store file uploaded
    private static final String UPLOAD_DIRECTORY = "upload";

    // upload settings
    private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB

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
        //response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String image = "abc.jpg";
        String url = "", error = "", fileName = "";
        Integer category_id, price;
        String message = "";

        //String fileName = "";
        if (name.equals("")) {
            error += "Vui lòng nhập vào tên loại sản phẩm\n";
        }
        if (description.equals("")) {
            error += "\nVui lòng nhập vào mô tả sản phẩm";
        }
        Part part = request.getPart("file");
        try {
            if (error.length() == 0) {
                category_id = Integer.parseInt(request.getParameter("category_id"));
                price = Integer.parseInt(request.getParameter("price"));
                doUpload(request, response, part);
                productDAO.insertProduct(new Product(category_id, price, name, getFileName(part), description));
                url = "/admin/list-product.jsp";
                message = "Thêm sản phẩm thành công";
                request.setAttribute("message", message);
            } else {
                request.setAttribute("error", error);
                request.setAttribute("name", name);
                request.setAttribute("description", description);
                url = "/admin/insert-product.jsp";
            }
        } catch (Exception e) {

        }
        request.getRequestDispatcher(url).forward(request, response);
    }

    private void doUpload(HttpServletRequest request,HttpServletResponse response, Part filePart) throws IOException, ServletException {
        // Create path components to save the file
        String path = "D:\\mobile-shop\\web\\upload";
        String fileName = getFileName(filePart);
        OutputStream out = null;
        InputStream filecontent = null;
       // final PrintWriter writer = response.getWriter();
        try {
            out = new FileOutputStream(new File(path + File.separator
                    + fileName));
            filecontent = filePart.getInputStream();

            int read = 0;
            final byte[] bytes = new byte[1024];

            while ((read = filecontent.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }

        } catch (FileNotFoundException fne) {
//            writer.println("You either did not specify a file to upload or are "
//                    + "trying to upload a file to a protected or nonexistent "
//                    + "location.");
//            writer.println("<br/> ERROR: " + fne.getMessage());

            LOGGER.log(Level.SEVERE, "Problems during file upload. Error: {0}",
                    new Object[]{fne.getMessage()});
        } finally {
            if (out != null) {
                out.close();
            }
            if (filecontent != null) {
                filecontent.close();
            }
//            if (writer != null) {
//                writer.close();
//            }
        }
    }

    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
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
