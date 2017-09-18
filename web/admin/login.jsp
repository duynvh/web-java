<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>AdminLTE 2 | Log in</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <!-- Bootstrap 3.3.7 -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/bootstrap.min.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/font-awesome.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/ionicons.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/AdminLTE.min.css">
        <!-- iCheck -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/css/square/blue.css">

        <!-- Google Font -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
    </head>
    <body class="hold-transition login-page">
        <div class="login-box">
            <div class="login-logo">
                <a href="."><b>Admin</b>LTE</a>
            </div>
            <!-- /.login-logo -->
            <div class="login-box-body">
                <p class="login-box-msg">Sign in to start your session</p>
                <%
                    String name = "";
                    if(request.getAttribute("name") != null) name = (String)request.getAttribute("name");
                %>
                <form action="${pageContext.request.contextPath}/LoginServlet" method="post">
                    <%if (request.getAttribute("error") != null) {%>
                    <div class="row">
                        <div class="alert alert-danger alert-dismissible">
                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                            <h4><i class="icon fa fa-check"></i> Alert!</h4>
                            <%=request.getAttribute("error")%>
                        </div>
                    </div>
                    <%}%>
                    <div class="form-group has-feedback">
                        <input value="<%=name%>" type="text" class="form-control" placeholder="Email" name="name">
                        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" class="form-control" placeholder="Password" name="password">
                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                    </div>
                    <div class="row">
                        <div class="col-xs-8">
                            <div class="checkbox icheck">
                                <label>
                                    <input type="checkbox"> Remember Me
                                </label>
                            </div>
                        </div>
                        <!-- /.col -->
                        <div class="col-xs-4">
                            <button type="submit" class="btn btn-primary btn-block btn-flat">Đăng nhập</button>
                        </div>
                        <!-- /.col -->
                    </div>
                </form>

<!--                <div class="social-auth-links text-center">
                    <p>- OR -</p>
                    <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-facebook"></i> Sign in using
                        Facebook</a>
                    <a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-google-plus"></i> Sign in using
                        Google+</a>
                </div>
                 /.social-auth-links 

                <a href="#">I forgot my password</a><br>
                <a href="register.html" class="text-center">Register a new membership</a>-->

            </div>
            <!-- /.login-box-body -->
        </div>
        <!-- /.login-box -->

        <!-- jQuery 3 -->
        <script src="${pageContext.request.contextPath}/admin/js/jquery.min.js"></script>
        <!-- Bootstrap 3.3.7 -->
        <script src="${pageContext.request.contextPath}/admin/js/bootstrap.min.js"></script>
        <!-- iCheck -->
        <script src="${pageContext.request.contextPath}/admin/js/icheck.min.js"></script>
        <script>
            $(function () {
                $('input').iCheck({
                    checkboxClass: 'icheckbox_square-blue',
                    radioClass: 'iradio_square-blue',
                    increaseArea: '20%' // optional
                });
            });
        </script>
    </body>
</html>
