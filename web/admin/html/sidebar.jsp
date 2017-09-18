<%-- 
    Document   : sidebar
    Created on : Sep 12, 2017, 12:13:50 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar" style="height: auto;">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="images/user2-160x160.jpg" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>Alexander Pierce</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                </div>
            </div>
            <!-- search form -->
            <form action="#" method="get" class="sidebar-form">
                <div class="input-group">
                    <input type="text" name="q" class="form-control" placeholder="Search...">
                    <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
                </div>
            </form>
            <!-- /.search form -->
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu tree" data-widget="tree">
                <li class="header">MAIN NAVIGATION</li>
                <li><a href="."><i class="fa fa-dashboard"></i> <span>Control Panel</span></a></li>

                <li class="treeview active">
                    <a href="#">
                        <i class="fa fa-pie-chart"></i>
                        <span>Config</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="#"><i class="fa fa-circle-o"></i> Email</a></li>
                        <li><a href="#"><i class="fa fa-circle-o"></i> Image</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="list.html">
                        <i class="fa fa-group"></i>
                        <span>Category</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="${root}/admin/list-category.jsp"><i class="fa fa-circle-o"></i> List category</a></li>
                        <li><a href="${root}/admin/insert-category.jsp"><i class="fa fa-circle-o"></i> Add new category</a></li>
                    </ul>
                </li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-book"></i>
                        <span>Product</span>
                        <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="${root}/admin/list-product.jsp"><i class="fa fa-circle-o"></i> List product</a></li>
                        <li><a href="create.html"><i class="fa fa-circle-o"></i> Add new product</a></li>
                    </ul>
                </li>
                <li>
                    <a href="pages/calendar.html">
                        <i class="fa fa-calendar"></i> <span>Contact</span>
                        <span class="pull-right-container">
              <small class="label pull-right bg-red">3</small>
              <small class="label pull-right bg-blue">17</small>
            </span>
                    </a>
                </li>

                <li>
                    <a href="pages/calendar.html">
                        <i class="fa fa-calendar"></i> <span>Order</span>
                        <span class="pull-right-container">
              <small class="label pull-right bg-red">3</small>
            </span>
                    </a>
                </li>
            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>>
