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
public class RemoveBookServlet extends HttpServlet {

   
   
    @EJB BookFacadeLocal obj;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        Long isbn = Long.parseLong(request.getParameter("isbn"));
         Book book = removeBook(isbn);
         obj.remove(book);
         request.setAttribute("isbn", isbn);
         
         
            RequestDispatcher rd= request.getRequestDispatcher("remove_outcome.jsp");
            rd.forward(request, response);
       
        
    }
    private  Book removeBook(Long isbn) {
     Book book = obj.find(isbn);
      return  book;
    }

    

}
