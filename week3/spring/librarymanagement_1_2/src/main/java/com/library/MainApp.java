package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Get the BookService bean
        BookService bookService = context.getBean("bookService", BookService.class);
        
        // Test the configuration
        String bookDetails = bookService.getBookDetails("123");
        System.out.println(bookDetails);
        
        ((ClassPathXmlApplicationContext) context).close();
    }
}
