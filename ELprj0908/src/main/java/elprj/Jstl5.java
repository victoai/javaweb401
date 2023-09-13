package elprj;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstl5")
public class Jstl5 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 	 

/*
 * 		books.add("부의 인문학");
		books.add("c언어를 배우기 전 알아야 할 것들");
		books.add("빌린돈은갚지마라");
 */
		ArrayList<Book> books  = new ArrayList<>();
		
		books.add( new Book("b001" ,"부의 인문학" ,15000));
		books.add( new Book("b002" ,"c언어를 배우기 전 알아야 할 것들" ,16000));
		books.add( new Book("b003" ,"빌린돈은갚지마라" ,12000));		
		
		
		req.setAttribute("books", books);
		req.getRequestDispatcher("WEB-INF/views/jstl5.jsp").forward(req, resp);
		 
	}

}