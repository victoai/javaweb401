package project0918;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/testel")
public class 탬플릿문자열실행막기  extends HttpServlet {
	
	  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		  req.getRequestDispatcher("WEB-INF/views/test.jsp").forward(req, resp);
		  
		  
	}

}
