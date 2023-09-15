package mvcProject;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


@WebServlet("/testjson")
public class JSONServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		   BufferedReader reader = request.getReader();
	        StringBuilder jsonBody = new StringBuilder();
	        String line;
	        while ((line = reader.readLine()) != null) {
	            jsonBody.append(line);
	        }
	
	        // JSON 데이터 파싱
	        Gson gson = new Gson();
	        User user = gson.fromJson(jsonBody.toString(), User.class);

	        // 파싱한 JSON 데이터에서 필요한 정보 추출
	        String id = user.getId();
	        String pw = user.getPw();

	        
	        System.out.println( id);
	        System.out.println( pw );
	        // 추출한 데이터를 사용하여 작업 수행
	        // ...

	        // 응답 보내기 (옵션)
	        response.setContentType("application/json");
	        response.setCharacterEncoding("UTF-8");
	        response.getWriter().write("{\"result\":\"success\"}");
		
	}

}
