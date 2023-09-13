package testprj;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/acorn2")
public class AcornServlet2 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	System.out.println("before"  );
	AcornService2 s = new AcornService2();
	ArrayList<Member> list = s.getMemberList();
	System.out.println("after" + list);
	
	req.setAttribute("list", list);
	req.getRequestDispatcher("WEB-INF/views/acorn2.jsp").forward(req, resp);
	
	
}
}
