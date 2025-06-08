/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import ac.za.tut.entity.Book;
import ac.za.tut.entity.BookFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zwivhuya sagida
 */
public class SearchBookServlet extends HttpServlet {

   

   @EJB BookFacadeLocal obj;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Long isbn = Long.parseLong(request.getParameter("isbn"));
        Book book = obj.find(isbn);
        
        request.setAttribute("book", book);
        
        
            RequestDispatcher rd= request.getRequestDispatcher("search_outcome.jsp");
            rd.forward(request, response);
       
    }

  

}
