<%-- 
    Document   : remove
    Created on : May 14, 2025, 6:07:53 PM
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
         <form action="RemoveBookServlet" method="POST">
            <table border="0">
                
                <tbody>
                    <tr>
                        <td>ISBN</td>
                        <td>
                            <input type="text" name="isbn" required=""/>
                        </td>
                    </tr>
                     
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" value="Remove_BOOK"/>
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
