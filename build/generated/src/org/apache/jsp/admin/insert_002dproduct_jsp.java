package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Category;
import java.util.ArrayList;
import dao.CategoryDAO;

public final class insert_002dproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "html/head.jsp", out, false);
      out.write("\n");
      out.write("    <body class=\"skin-blue sidebar-mini wysihtml5-supported\" style=\"height: auto; min-height: 100%;\">\n");
      out.write("    <div class=\"wrapper\" style=\"height: auto; min-height: 100%;\">\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "html/header.jsp", out, false);
      out.write("\n");
      out.write("            <!-- Left side column. contains the logo and sidebar -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "html/sidebar.jsp", out, false);
      out.write("\n");
      out.write("        ");
 
            CategoryDAO categoryDAO = new CategoryDAO();
            ArrayList<Category> listCategory = categoryDAO.getListCategory();
        
      out.write("\n");
      out.write("            <!-- Content Wrapper. Contains page content -->\n");
      out.write("            <div class=\"content-wrapper\" style=\"min-height: 916px;\">\n");
      out.write("                <!-- Content Header (Page header) -->\n");
      out.write("                <section class=\"content-header\">\n");
      out.write("                    <h1>\n");
      out.write("                        Dashboard\n");
      out.write("                        <small>Control panel</small>\n");
      out.write("                    </h1>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\n");
      out.write("                        <li class=\"active\">Dashboard</li>\n");
      out.write("                    </ol>\n");
      out.write("                </section>\n");
      out.write("                <section class=\"content\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <a class=\"btn btn-app\"><i class=\"fa fa-save\"></i> Save</a>\n");
      out.write("                            <a class=\"btn btn-app\"><i class=\"fa fa-arrow-left\"></i> Back</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AddProductServlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                        ");
if(request.getAttribute("error") != null) {
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"alert alert-danger alert-dismissible\">\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>\n");
      out.write("                                <h4><i class=\"icon fa fa-check\"></i> Alert!</h4>\n");
      out.write("                                ");
      out.print(request.getAttribute("error"));
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        <div class=\"box-body\">\n");
      out.write("                            ");

                                //String name = "", description = "", price = "";
                                //if(request.getAttribute("name") != null) name = (String)request.getAttribute("name");
                                //if(request.getAttribute("description") != null) description = (String)request.getAttribute("description");
                                //if(request.getAttribute("price") != null) price = (String)request.getAttribute("price");
                            
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"name\">Tên sản phẩm</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"Vui lòng nhập vào tên sản phẩm\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"category_id\">Chuyên mục</label>\n");
      out.write("                                <select class=\"form-control\" name=\"category_id\">\n");
      out.write("                                    ");
for(Category c : listCategory) {
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(c.getId());
      out.write('"');
      out.write('>');
      out.print(c.getName());
      out.write("</option>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"price\">Giá tiền</label>\n");
      out.write("                                <input min=\"1\" type=\"number\" class=\"form-control\" name=\"price\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"file\">Hình</label>\n");
      out.write("                                <input type=\"file\" name=\"file\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"description\">Mô tả</label>\n");
      out.write("                                <textarea name=\"description\" id=\"description\" class=\"form-control\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Thêm sản phẩm</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.content-wrapper -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "html/footer.jsp", out, false);
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("root");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
