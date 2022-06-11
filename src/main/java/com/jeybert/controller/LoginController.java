package com.jeybert.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jeybert.model.User;




public class LoginController extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.addHeader("Access-Control-Allow-Origin", "*");
		 StringBuilder sb = new StringBuilder();
		    BufferedReader reader = request.getReader();
		    try {
		        String line;
		        while ((line = reader.readLine()) != null) {
		            sb.append(line).append('\n');
		        }
		       
		        ObjectMapper mapper = new ObjectMapper(); 
		        User user = mapper.readValue(sb.toString(),User.class); 
		        
		        System.out.println("Email - " + user.getEmail() );
		        System.out.println("Pass - " + user.getPassword() );
		        
		    } finally {
		        reader.close();
		    }
		    System.out.println(sb.toString());
	}
	

	}


