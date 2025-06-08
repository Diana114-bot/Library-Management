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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class AddBookServlet extends HttpServlet {

  
   @EJB BookFacadeLocal obj;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String year = request.getParameter("year");
        SimpleDateFormat sm = new SimpleDateFormat("YYYY");
       
           Date pubYear = sm.parse(year);
      
        Long isbn = Long.parseLong(request.getParameter("isbn"));
        String availability = request.getParameter("status");
        String genre = request.getParameter("genre");
        
        Book book = addBook(isbn, title, author, pubYear, availability, genre);
        
        obj.create(book);
        
          request.setAttribute("title", title);
          
            RequestDispatcher rd= request.getRequestDispatcher("add_outcome.jsp");
            rd.forward(request, response);
         } catch (ParseException ex) {
           Logger.getLogger(AddBookServlet.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
   private Book addBook(Long id, String title, String author, Date pubDate, String availability,String genre){
   
     Book book = new Book();
      book.setAuthor(author);
      book.setAvailability(availability);
      book.setCreationTime(new Date());
      book.setPubDate(pubDate);
      book.setTitle(title);
      book.setGenre(genre);
      book.setId(id);
      return book;
   
   }

}
