<%-- 
    Document   : add
    Created on : May 14, 2025, 5:02:36 PM
    Author     : zwivhuya sagida
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add Page</title>
    </head>
    <body>
        <form action="AddBookServlet" method="POST">
            <table border="0">
                
                <tbody>
                    <tr>
                        <td>ISBN</td>
                        <td>
                            <input type="text" name="isbn" required=""/>
                        </td>
                    </tr>
                    <tr>
                        <td>Title</td>
                        <td>
                            <input type="text" name="title" required=""/>
                        </td>
                    </tr>
                    <tr>
                        <td>Author</td>
                        <td>
                            <input type="text" name="author" required=""/>
                        </td>
                    </tr>
                    <tr>
                        <td>Pub Year</td>
                        <td>
                            <input type="text" name="year" required="" placeholder="YYYY"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Genre</td>
                        <td>
                            <input type="text" name="genre" required=""/>
                        </td>
                    </tr>
                    <tr>
                        <td>Status</td>
                        <td>
                            <select name="status">
                                <option value="Available"> Available</option>
                                <option value="Borrowed">Borrowed</option>
                                <option value="Lost">Lost</option>
                            </select>
                        </td>
                        
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" value="ADD_BOOK"/>
                        </td>
                    </tr>
                </tbody>
            </table>

            
        </form>
    </body>
</html>
