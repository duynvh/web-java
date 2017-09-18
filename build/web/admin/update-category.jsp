<%-- 
    Document   : update-category
    Created on : Sep 12, 2017, 12:20:26 PM
    Author     : nguye
--%>
<%@page import="model.Category"%>
<%@page import="dao.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="html/head.jsp"></jsp:include>
    <body class="skin-blue sidebar-mini wysihtml5-supported" style="height: auto; min-height: 100%;">
        <div class="wrapper" style="height: auto; min-height: 100%;">

        <jsp:include page="html/header.jsp"></jsp:include>
            <!-- Left side column. contains the logo and sidebar -->
        <jsp:include page="html/sidebar.jsp"></jsp:include>

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper" style="min-height: 916px;">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Dashboard
                        <small>Control panel</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">Dashboard</li>
                    </ol>
                </section>
                <section class="content">
                    <div class="row">
                        <div class="text-center">
                            <a class="btn btn-app"><i class="fa fa-save"></i> Save</a>
                            <a class="btn btn-app"><i class="fa fa-arrow-left"></i> Back</a>
                        </div>
                    </div>
                    <% 
                        String error = "";
                        String category_id = request.getParameter("category_id");
                        int id = Integer.valueOf(category_id);
                        CategoryDAO categoryDAO = new CategoryDAO();
                        Category category = new Category();
                        category = categoryDAO.getCategoryWhereID(id);
                        String name = category.getName(), description = category.getDescription();
                        if(request.getAttribute("name") != null)  name = (String)request.getAttribute("name");
                        if(request.getAttribute("description") != null)  description = (String)request.getAttribute("description");
                    %>
                    <form role="form" method="post" action="${pageContext.request.contextPath}/UpdateCategoryServlet">
                    <%if(request.getAttribute("error") != null) {%>
                        <div class="row">
                            <div class="alert alert-danger alert-dismissible">
                                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                                <h4><i class="icon fa fa-check"></i> Alert!</h4>
                                <%=request.getAttribute("error")%>
                            </div>
                        </div>
                    <%}%>
                    <div class="box-body">
                        <div class="form-group">
                            <label for="name">Loại sản phẩm</label>
                            <input type="text" class="form-control" name="name" value="<%=name%>" placeholder="Vui lòng nhập vào loại sản phẩm">
                        </div>
                        <div class="form-group">
                            <label for="description">Mô tả</label>
                            <textarea name="description" id="description" class="form-control"><%=description%></textarea>
                        </div>
                        <input type="hidden" name="category_id" value="<%=request.getParameter("category_id")%>">
                        <button type="submit" class="btn btn-primary">Cập nhật sản phẩm</button>
                    </div>
                </form>
            </section>
        </div>
        <!-- /.content-wrapper -->
        <jsp:include page="html/footer.jsp"></jsp:include>
