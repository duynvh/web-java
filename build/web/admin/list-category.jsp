<%-- 
    Document   : list-category
    Created on : Sep 12, 2017, 12:15:27 PM
    Author     : nguye
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Category"%>
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
                    <a class="btn btn-app"><i class="fa fa-refresh"></i> Reload</a>
                    <a class="btn btn-app"><i class="fa fa-plus-square-o"></i> Add</a>
                    <a class="btn btn-app"><i class="fa fa-check-circle-o"></i> Publish</a>
                    <a class="btn btn-app"><i class="fa fa-circle-o"></i> Unpublish</a>
                    <a class="btn btn-app"><i class="fa fa-minus-square-o"></i> Delete</a>
                </div>
            </div>
<!--            <div class="row">
                <div class="alert alert-success alert-dismissible">
                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                    <h4><i class="icon fa fa-check"></i> Alert!</h4>
                    Success alert preview. This alert is dismissable.
                </div>
            </div>-->
            <% if(request.getAttribute("message") != null) {%>
            <div class="row">
                <div class="alert alert-success alert-dismissible">
                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                    <h4><i class="icon fa fa-check"></i> Alert!</h4>
                    <%=request.getAttribute("message")%>
                </div>
            </div>
            <%}%>           
            <div class="box">
                <div style="padding: 20px;">
                    <a href="${root}/admin/insert-category.jsp" class="btn btn-info">Thêm loại sản phẩm</a>
                </div>
                <div class="box-header">
                    <h3 class="box-title">Danh sách loại sản phẩm</h3>
                </div>
                <!-- /.box-header -->
                <div class="box-body">
                    <div id="example1_wrapper" class="dataTables_wrapper form-inline dt-bootstrap">
                        <div class="row">
                            <div class="col-sm-6">
                                <div class="dataTables_length" id="example1_length"><label>Show <select
                                        name="example1_length" aria-controls="example1" class="form-control input-sm">
                                    <option value="10">10</option>
                                    <option value="25">25</option>
                                    <option value="50">50</option>
                                    <option value="100">100</option>
                                </select> entries</label></div>
                            </div>
                            <div class="col-sm-6">
                                <div id="example1_filter" class="dataTables_filter"><label>Search:<input type="search"
                                                                                                         class="form-control input-sm"
                                                                                                         placeholder=""
                                                                                                         aria-controls="example1"></label>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-12">
                                <table id="example1" class="table table-bordered table-striped dataTable" role="grid"
                                       aria-describedby="example1_info">
                                    <thead>
                                    <tr role="row">
                                        <th class="sorting_asc" tabindex="0" aria-controls="example1" rowspan="1"
                                            colspan="1" aria-sort="ascending"
                                            aria-label="Rendering engine: activate to sort column descending"
                                            >ID
                                        </th>
                                        <th class="sorting_asc" tabindex="0" aria-controls="example1" rowspan="1"
                                            colspan="1" aria-sort="ascending"
                                            aria-label="Rendering engine: activate to sort column descending"
                                            >Tên loại
                                        </th>
                                        <th class="sorting" tabindex="0" aria-controls="example1" rowspan="1"
                                            colspan="1" aria-label="CSS grade: activate to sort column ascending"
                                            >Hành động
                                        </th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <% 
                                        int count = 0;
                                        for(Category category : listCategory) 
                                        {
                                            count++;
                                    %>
                                    <tr class="gradeX odd" role="row">
                                        <td class="sorting_1"><%=count%></td>
                                        <td><%=category.getName()%></td>
                                        <td>
                                            <a title="Edit" class="btn btn-info btn-action-edit"
                                               href="${root}/admin/update-category.jsp?command=update&category_id=<%=category.getId()%>">
                                                <i class="fa fa-pencil fa-fw"></i>
                                            </a>
                                            <a title="Delete" class="btn btn-danger btn-action-delete"
                                               href="/mobile-shop/DeleteCategoryServlet?command=delete&id=<%=category.getId()%>">
                                                <i class="fa fa-trash-o fa-fw"></i>
                                            </a>
                                        </td>
                                    </tr>
                                    <%
                                        }
                                    %>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-5">
                                <div class="dataTables_info" id="example1_info" role="status" aria-live="polite">Showing
                                    1 to 10 of 57 entries
                                </div>
                            </div>
                            <div class="col-sm-7">
                                <div class="dataTables_paginate paging_simple_numbers" id="example1_paginate">
                                    <ul class="pagination">
                                        <li class="paginate_button previous disabled" id="example1_previous"><a href="#"
                                                                                                                aria-controls="example1"
                                                                                                                data-dt-idx="0"
                                                                                                                tabindex="0">Previous</a>
                                        </li>
                                        <li class="paginate_button active"><a href="#" aria-controls="example1"
                                                                              data-dt-idx="1" tabindex="0">1</a></li>
                                        <li class="paginate_button "><a href="#" aria-controls="example1"
                                                                        data-dt-idx="2" tabindex="0">2</a></li>
                                        <li class="paginate_button "><a href="#" aria-controls="example1"
                                                                        data-dt-idx="3" tabindex="0">3</a></li>
                                        <li class="paginate_button "><a href="#" aria-controls="example1"
                                                                        data-dt-idx="4" tabindex="0">4</a></li>
                                        <li class="paginate_button "><a href="#" aria-controls="example1"
                                                                        data-dt-idx="5" tabindex="0">5</a></li>
                                        <li class="paginate_button "><a href="#" aria-controls="example1"
                                                                        data-dt-idx="6" tabindex="0">6</a></li>
                                        <li class="paginate_button next" id="example1_next"><a href="#"
                                                                                               aria-controls="example1"
                                                                                               data-dt-idx="7"
                                                                                               tabindex="0">Next</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </div>
    <!-- /.content-wrapper -->
<jsp:include page="html/footer.jsp"></jsp:include>
