<%-- 
    Document   : add_outcome
    Created on : May 14, 2025, 5:33:21 PM
    Author     : zwivhuya sagida
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String title = (String) request.getAttribute("title");
            %>
            <p>
                <%=title%> was added to a database successfully.<br>
                <a href="index.html">Click here to home page.</a><br>
                <a href="menu.html">Click here to menu page.</a>
            </p>
    </body>
</html>
