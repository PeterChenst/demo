package com.example.springbootweb.servlet;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//整合servelt方式一
@WebServlet(name = "FirstServlet",urlPatterns = "/first")
public class FirstServlet extends HttpServlet {
     public void doGet(HttpServletRequest request, HttpServletResponse response){
         System.out.println("Firstservlet .......");
     }
}
