<%-- 
    Document   : remove_outcome
    Created on : May 14, 2025, 6:18:14 PM
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
            Long isbn = (Long) request.getAttribute("isbn");
            %>
            <p>
                <%=isbn%> was removed to a database successfully.<br>
                <a href="index.html">Click here to home page.</a><br>
                <a href="menu.html">Click here to menu page.</a>
            </p>
    </body>
</html>
