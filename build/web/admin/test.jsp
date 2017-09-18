<%-- 
    Document   : test
    Created on : Sep 15, 2017, 9:49:21 AM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Choose File to Upload in Server</h3>
        <form action="${pageContext.request.contextPath}/UploadServlet" method="post" enctype="multipart/form-data">
                <input type="file" name="file" />
                <input type="text" name="text">
                <input type="submit" value="upload" />
        </form>
    </body>
</html>
