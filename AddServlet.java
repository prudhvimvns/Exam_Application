import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AddServlet extends HttpServlet {
	
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
{
//	int i=Integer.parseInt(req.getParameter("num1"));
//	int j=Integer.parseInt(req.getParameter("num2"));
	
	String str=req.getParameter("submit");
	
//	int k=i+j;
//	req.setAttribute("k", k);
	PrintWriter out=res.getWriter();
	//out.println("result is"+ k);
//	RequestDispatcher rd=req.getRequestDispatcher("sq");
//	rd.forward(req, res);
	//in requestredirect we can send values from query string using URL-Rewriting and also using sessions
	// and cookies.
//	res.sendRedirect("sq?k="+k);
	
//	Cookie cookie=new Cookie("k",k+"");
//	res.addCookie(cookie);
//	res.sendRedirect("sq");
	
out.println(str);
}
}
 