package clc65.ithanhphan.baith13;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaiTH13
 */
@WebServlet(name = "AboutMe", urlPatterns = { "/AboutMe" })
public class BaiTH13 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BaiTH13() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>About Me</title>");
		out.println("<style>");
		out.println("body { font-family: Arial; background-color: #f2f2f2; }");
		out.println(".box { width: 400px; margin: 50px auto; padding: 20px; background: white; border-radius: 10px; }");
		out.println("h2 { text-align: center; color: #2c3e50; }");
		out.println("p { font-size: 16px; }");
		out.println("</style>");
		out.println("</head>");

		out.println("<body>");
		out.println("<div class='box'>");
		out.println("<h2>Thông tin cá nhân</h2>");
		out.println("<p><b>Họ và tên:</b> Sĩ Thành</p>");
		out.println("<p><b>Lớp:</b> CLC65</p>");
		out.println("<p><b>Ngành:</b> Công nghệ thông tin</p>");
		out.println("<p><b>Sở thích:</b> Lập trình, học công nghệ mới</p>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
