 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if ("ITHANH".equals(username) && "12345678".equals(password)) {
        response.sendRedirect("UserProfile.html");
    } else {
        response.sendRedirect("Login.html");
    }
%>	`	