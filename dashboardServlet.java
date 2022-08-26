import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/dashboardServlet")
public class dashboardServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String examtype= req.getParameter("selected");
		Cookie cookie=new Cookie("examtype",examtype);
		res.addCookie(cookie);
		res.sendRedirect("instructions.html");
	}

}
