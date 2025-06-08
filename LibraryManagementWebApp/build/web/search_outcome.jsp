<%-- 
    Document   : search_outcome
    Created on : May 14, 2025, 5:48:51 PM
    Author     : zwivhuya sagida
--%>

<%@page import="ac.za.tut.entity.Book"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>search outcome Page</title>
    </head>
    <body>
        <%
            Book book = (Book) request.getAttribute("book");
            
            %>
            <table border="1">
                <thead>
                    <tr>
                        <th>ISBN</th>
                        <th>Title</th>
                        <th>Author</th>
                        <th>Publication Year</th>
                        <th>Genre</th>
                        <th>Availability</th>
                        <th>Creation Date</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><%= book.getId()%></td>
                        <td><%=book.getTitle()%></td>
                        <td><%=book.getAuthor()%></td>
                        <td><%=book.getPubDate()%></td>
                        <td><%=book.getGenre()%></td>
                        <td><%=book.getAvailability()%></td>
                        <td><%= book.getCreationTime()%></td>
                    </tr>
                </tbody>
            </table>
                    <p>
                        <a href="index.html">Click here to home page.</a><br>
                <a href="menu.html">Click here to menu page.</a>
                    </p>
    </body>
</html>
