<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
    <%@ page import="net.javaguides.login.bean.*"%>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title>Insert title here</title>
        </head>

        <body>

             <jsp:useBean id="login" class="net.javaguides.login.bean.LoginBean1" />

            <jsp:setProperty property="*" name="login" /> 

            <%
           
            String error="*Invalid Credentials";
  LoginDao1 loginDao=new LoginDao1();
   boolean status = loginDao.validate(login);
   if (status) {
          response.sendRedirect("dashboard.html"); 
          }
          else{
        	      
        	       response.sendRedirect("Login1.jsp?error="+error);
        	  }
          
 %>
        </body>

        </html>
