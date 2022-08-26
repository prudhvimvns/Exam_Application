

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.parser.Cookie;

/**
 * Servlet implementation class square
 */
@WebServlet("/sq")
public class square extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// in the case of request dispatcher we can pass req,res
		// objects and can set and get attributes like below
//		int k=(int) req.getAttribute("k");
		
		
		// but in the case of request redirect we can send the values through
		// query string using URL- Rewriting so that the servlet thinks it as a parameter and can get them through get parameter method
		
//		int k=Integer.parseInt(req.getParameter("k"));
		
		//Cookie will always send as an array so we need to accept and keep them in array
		int k=0;
		javax.servlet.http.Cookie cookies[]= req.getCookies();
		for(javax.servlet.http.Cookie c: cookies) {
			if(c.getName().equals("k"))
			{
				k=Integer.parseInt(c.getValue());
			}
		}
		
		PrintWriter out =response.getWriter();
		out.println(k*k+ " is the square");
		
	}

}
