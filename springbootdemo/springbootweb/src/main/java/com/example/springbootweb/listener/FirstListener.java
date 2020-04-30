package com.example.springbootweb.listener;

import javax.servlet.Servlet;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class FirstListener implements ServletContextListener {
    public void contextDestoryed(ServletContextEvent event){

    }

    public  void contextInitialized(ServletContextEvent event){
        System.out.println("Listener ... Init...");
    }

}
