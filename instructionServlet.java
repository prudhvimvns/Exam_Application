import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/instructionServlet")
public class instructionServlet extends HttpServlet{
	private String examtype;
	
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{   
		
		Cookie cookies[]=req.getCookies();
		for(Cookie e:cookies)
		{
			if(e.getName().equals("examtype")) {
				this.examtype=e.getValue();
			}
		}
		System.out.println(examtype);
		if(examtype.equals("ACE")) 
		{
			res.sendRedirect("ACE.html");
		}
		else if(examtype.equals("FEDE")) 
		{
			res.sendRedirect("FEDE.html");
		}
		else if(examtype.equals("OUE")) 
		{
			res.sendRedirect("OUE.html");
		}
		else if(examtype.equals("ATE"))
		{
			res.sendRedirect("ATE.html");
		}
		
	}

}
