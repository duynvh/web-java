<%-- 
    Document   : insert-product
    Created on : Sep 14, 2017, 3:45:03 AM
    Author     : nguye
--%>

<%@page import="model.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<jsp:include page="html/head.jsp"></jsp:include>
    <body class="skin-blue sidebar-mini wysihtml5-supported" style="height: auto; min-height: 100%;">
    <div class="wrapper" style="height: auto; min-height: 100%;">

        <jsp:include page="html/header.jsp"></jsp:include>
            <!-- Left side column. contains the logo and sidebar -->
        <jsp:include page="html/sidebar.jsp"></jsp:include>
        <% 
            CategoryDAO categoryDAO = new CategoryDAO();
            ArrayList<Category> listCategory = categoryDAO.getListCategory();
        %>
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
                    
                    <form action="${pageContext.request.contextPath}/AddProductServlet" method="post" enctype="multipart/form-data">
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
                            <%
                                //String name = "", description = "", price = "";
                                //if(request.getAttribute("name") != null) name = (String)request.getAttribute("name");
                                //if(request.getAttribute("description") != null) description = (String)request.getAttribute("description");
                                //if(request.getAttribute("price") != null) price = (String)request.getAttribute("price");
                            %>
                            <div class="form-group">
                                <label for="name">Tên sản phẩm</label>
                                <input type="text" class="form-control" name="name" placeholder="Vui lòng nhập vào tên sản phẩm">
                            </div>
                            <div class="form-group">
                                <label for="category_id">Chuyên mục</label>
                                <select class="form-control" name="category_id">
                                    <%for(Category c : listCategory) {%>
                                        <option value="<%=c.getId()%>"><%=c.getName()%></option>
                                    <%}%>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="price">Giá tiền</label>
                                <input min="1" type="number" class="form-control" name="price">
                            </div>
                            <div class="form-group">
                                <label for="file">Hình</label>
                                <input type="file" name="file" />
                            </div>
                            <div class="form-group">
                                <label for="description">Mô tả</label>
                                <textarea name="description" id="description" class="form-control"></textarea>
                            </div>
                            <button type="submit" class="btn btn-primary">Thêm sản phẩm</button>
                        </div>
                    </form>
                </section>
            </div>
            <!-- /.content-wrapper -->
        <jsp:include page="html/footer.jsp"></jsp:include>
