package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Product;
import dao.ProductDAO;

public final class list_002dproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body class=\"skin-blue sidebar-mini wysihtml5-supported\" style=\"height: auto; min-height: 100%;\">\n");
      out.write("<div class=\"wrapper\" style=\"height: auto; min-height: 100%;\">\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "html/header.jsp", out, false);
      out.write("\n");
      out.write("    <!-- Left side column. contains the logo and sidebar -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "html/sidebar.jsp", out, false);
      out.write("\n");
      out.write("    ");
 
        ProductDAO productDAO = new ProductDAO();
        ArrayList<Product> listProduct = productDAO.getListProduct();
    
      out.write("\n");
      out.write("    <!-- Content Wrapper. Contains page content -->\n");
      out.write("    <div class=\"content-wrapper\" style=\"min-height: 916px;\">\n");
      out.write("        <!-- Content Header (Page header) -->\n");
      out.write("        <section class=\"content-header\">\n");
      out.write("            <h1>\n");
      out.write("                Dashboard\n");
      out.write("                <small>Control panel</small>\n");
      out.write("            </h1>\n");
      out.write("            <ol class=\"breadcrumb\">\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\n");
      out.write("                <li class=\"active\">Dashboard</li>\n");
      out.write("            </ol>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"content\">\n");
      out.write("<!--            <div class=\"row\">\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                    <a class=\"btn btn-app\"><i class=\"fa fa-refresh\"></i> Reload</a>\n");
      out.write("                    <a class=\"btn btn-app\"><i class=\"fa fa-plus-square-o\"></i> Add</a>\n");
      out.write("                    <a class=\"btn btn-app\"><i class=\"fa fa-check-circle-o\"></i> Publish</a>\n");
      out.write("                    <a class=\"btn btn-app\"><i class=\"fa fa-circle-o\"></i> Unpublish</a>\n");
      out.write("                    <a class=\"btn btn-app\"><i class=\"fa fa-minus-square-o\"></i> Delete</a>\n");
      out.write("                </div>\n");
      out.write("            </div>-->\n");
      out.write("            ");
 if(request.getAttribute("message") != null) {
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"alert alert-success alert-dismissible\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">×</button>\n");
      out.write("                    <h4><i class=\"icon fa fa-check\"></i> Alert!</h4>\n");
      out.write("                    ");
      out.print(request.getAttribute("message"));
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write(" \n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div style=\"padding: 20px;\">\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/insert-product.jsp\" class=\"btn btn-info\">Thêm sản phẩm</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box-header\">\n");
      out.write("                    <h3 class=\"box-title\">Danh sách sản phẩm</h3>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.box-header -->\n");
      out.write("                <div class=\"box-body\">\n");
      out.write("                    <div id=\"example1_wrapper\" class=\"dataTables_wrapper form-inline dt-bootstrap\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"dataTables_length\" id=\"example1_length\"><label>Show <select\n");
      out.write("                                        name=\"example1_length\" aria-controls=\"example1\" class=\"form-control input-sm\">\n");
      out.write("                                    <option value=\"10\">10</option>\n");
      out.write("                                    <option value=\"25\">25</option>\n");
      out.write("                                    <option value=\"50\">50</option>\n");
      out.write("                                    <option value=\"100\">100</option>\n");
      out.write("                                </select> entries</label></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div id=\"example1_filter\" class=\"dataTables_filter\"><label>Search:<input type=\"search\"\n");
      out.write("                                                                                                         class=\"form-control input-sm\"\n");
      out.write("                                                                                                         placeholder=\"\"\n");
      out.write("                                                                                                         aria-controls=\"example1\"></label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <table id=\"example1\" class=\"table table-bordered table-striped dataTable\" role=\"grid\"\n");
      out.write("                                       aria-describedby=\"example1_info\">\n");
      out.write("                                    <thead>\n");
      out.write("                                    <tr role=\"row\">\n");
      out.write("                                        <th class=\"sorting_asc\" tabindex=\"0\" aria-controls=\"example1\" rowspan=\"1\"\n");
      out.write("                                            colspan=\"1\" aria-sort=\"ascending\"\n");
      out.write("                                            aria-label=\"Rendering engine: activate to sort column descending\"\n");
      out.write("                                            >ID\n");
      out.write("                                        </th>\n");
      out.write("                                        <th class=\"sorting_asc\" tabindex=\"0\" aria-controls=\"example1\" rowspan=\"1\"\n");
      out.write("                                            colspan=\"1\" aria-sort=\"ascending\"\n");
      out.write("                                            aria-label=\"Rendering engine: activate to sort column descending\"\n");
      out.write("                                            >Tên loại\n");
      out.write("                                        </th>\n");
      out.write("                                        \n");
      out.write("                                        <th class=\"sorting_asc\" tabindex=\"0\" aria-controls=\"example1\" rowspan=\"1\"\n");
      out.write("                                            colspan=\"1\" aria-sort=\"ascending\"\n");
      out.write("                                            aria-label=\"Rendering engine: activate to sort column descending\"\n");
      out.write("                                            >Hinh\n");
      out.write("                                        </th>\n");
      out.write("                                        \n");
      out.write("                                        <th class=\"sorting_asc\" tabindex=\"0\" aria-controls=\"example1\" rowspan=\"1\"\n");
      out.write("                                            colspan=\"1\" aria-sort=\"ascending\"\n");
      out.write("                                            aria-label=\"Rendering engine: activate to sort column descending\"\n");
      out.write("                                            >Tên sản phẩm\n");
      out.write("                                        </th>\n");
      out.write("                                        <th class=\"sorting_asc\" tabindex=\"0\" aria-controls=\"example1\" rowspan=\"1\"\n");
      out.write("                                            colspan=\"1\" aria-sort=\"ascending\"\n");
      out.write("                                            aria-label=\"Rendering engine: activate to sort column descending\"\n");
      out.write("                                            >Giá\n");
      out.write("                                        </th>\n");
      out.write("                                        <th class=\"sorting\" tabindex=\"0\" aria-controls=\"example1\" rowspan=\"1\"\n");
      out.write("                                            colspan=\"1\" aria-label=\"CSS grade: activate to sort column ascending\"\n");
      out.write("                                            >Hành động\n");
      out.write("                                        </th>\n");
      out.write("                                    </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                    ");
 
                                        int count = 0;
                                        for(Product product : listProduct) 
                                        {
                                            count++;
                                    
      out.write("\n");
      out.write("                                    <tr class=\"gradeX odd\" role=\"row\">\n");
      out.write("                                        <td class=\"sorting_1\">");
      out.print(count);
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(productDAO.getNameCategoryWhereCategoryID(product.getCategory_id()));
      out.write("</td>\n");
      out.write("                                        <td><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/upload/");
      out.print(product.getImage());
      out.write("\" width=\"150px\" height=\"100px\" alt=\"No Image\"/></td>\n");
      out.write("                                        <td>");
      out.print(product.getName());
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(product.getPrice());
      out.write("</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <a title=\"Edit\" class=\"btn btn-info btn-action-edit\"\n");
      out.write("                                               href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/update-product.jsp?product_id=");
      out.print(product.getId());
      out.write("\">\n");
      out.write("                                                <i class=\"fa fa-pencil fa-fw\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a title=\"Delete\" class=\"btn btn-danger btn-action-delete\"\n");
      out.write("                                               href=\"/mobile-shop/DeleteProductServlet?id=");
      out.print(product.getId());
      out.write("\">\n");
      out.write("                                                <i class=\"fa fa-trash-o fa-fw\"></i>\n");
      out.write("                                            </a>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-5\">\n");
      out.write("                                <div class=\"dataTables_info\" id=\"example1_info\" role=\"status\" aria-live=\"polite\">Showing\n");
      out.write("                                    1 to 10 of 57 entries\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-7\">\n");
      out.write("                                <div class=\"dataTables_paginate paging_simple_numbers\" id=\"example1_paginate\">\n");
      out.write("                                    <ul class=\"pagination\">\n");
      out.write("                                        <li class=\"paginate_button previous disabled\" id=\"example1_previous\"><a href=\"#\"\n");
      out.write("                                                                                                                aria-controls=\"example1\"\n");
      out.write("                                                                                                                data-dt-idx=\"0\"\n");
      out.write("                                                                                                                tabindex=\"0\">Previous</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"paginate_button active\"><a href=\"#\" aria-controls=\"example1\"\n");
      out.write("                                                                              data-dt-idx=\"1\" tabindex=\"0\">1</a></li>\n");
      out.write("                                        <li class=\"paginate_button \"><a href=\"#\" aria-controls=\"example1\"\n");
      out.write("                                                                        data-dt-idx=\"2\" tabindex=\"0\">2</a></li>\n");
      out.write("                                        <li class=\"paginate_button \"><a href=\"#\" aria-controls=\"example1\"\n");
      out.write("                                                                        data-dt-idx=\"3\" tabindex=\"0\">3</a></li>\n");
      out.write("                                        <li class=\"paginate_button \"><a href=\"#\" aria-controls=\"example1\"\n");
      out.write("                                                                        data-dt-idx=\"4\" tabindex=\"0\">4</a></li>\n");
      out.write("                                        <li class=\"paginate_button \"><a href=\"#\" aria-controls=\"example1\"\n");
      out.write("                                                                        data-dt-idx=\"5\" tabindex=\"0\">5</a></li>\n");
      out.write("                                        <li class=\"paginate_button \"><a href=\"#\" aria-controls=\"example1\"\n");
      out.write("                                                                        data-dt-idx=\"6\" tabindex=\"0\">6</a></li>\n");
      out.write("                                        <li class=\"paginate_button next\" id=\"example1_next\"><a href=\"#\"\n");
      out.write("                                                                                               aria-controls=\"example1\"\n");
      out.write("                                                                                               data-dt-idx=\"7\"\n");
      out.write("                                                                                               tabindex=\"0\">Next</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.content-wrapper -->\n");
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
