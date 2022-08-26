<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!Doctype html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <script type="text/javascript">
        function validatePassword() {
            var Password = document.getElementById('pass').value;
            var regx1  = /^[a-zA-Z0-9!@#$%^&*]{6,16}$/;
           // if(newPassword.length < minNumberofChars || newPassword.length > maxNumberofChars){
               // alert("password is too short");
             //   return false;
           //   
            if(!regx1.test(Password)) {
                alert("password should contain atleast contain min six characters");
                return false;
            }
            else{
            	}
            }
        
        </script>
        <link rel="stylesheet"
          href= 
"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 
<style>
body{
background-image:url("https://www.abjayon.com/wp-content/uploads/2020/08/news10_banner.jpg");
}
.hover{
background-color:lightblue;
}
.header{
margin-left:120px;
margin-right:700px;
margin-top:200px;
margin-bottom:200px;
text-align:center;
}
form{
margin-left:50px;
margin-right:50px;
}
.button{
    color: green;   
}
#error{
   color: red;
    font-family: sans-serif;
    font-weight: bold;
    font-size: 15px;
    
}
</style>
</head>
<body>
<div class="header">
<form action="loginsuccess.jsp" method="post" onsubmit="return validatePassword();">
<h1>Login Form</h1><br>
<input  type="email"  name="username" placeholder="Enter email address" required><br><br>
<input  type="password" id="pass" name="password" placeholder="Enter password" required><br><br>
<div id=error>
<%
    
    if(request.getParameter("error")==null)
    {}
    else{
    	String str=request.getParameter("error");
    out.println(str);
    }
%></div>
  <input class="button" type="submit" value="Submit" />
</form>
</div>
</body>
</html>
