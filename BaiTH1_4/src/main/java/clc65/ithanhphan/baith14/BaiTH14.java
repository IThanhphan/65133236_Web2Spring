package clc65.ithanhphan.baith14;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaiTH14
 */
@WebServlet(name = "BMI", urlPatterns = { "/BMI" })
public class BaiTH14 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BaiTH14() {
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
		out.println("<title>Tính BMI</title>");
		out.println("<style>");
		out.println("body { font-family: Arial; background-color: #f2f2f2; }");
		out.println(".box { width: 400px; margin: 50px auto; padding: 20px; background: white; border-radius: 10px; }");
		out.println("h2 { text-align: center; }");
		out.println("input { width: 100%; padding: 8px; margin: 10px 0; }");
		out.println("button { width: 100%; padding: 10px; background: #3498db; color: white; border: none; }");
		out.println("</style>");
		out.println("</head>");

		out.println("<body>");
		out.println("<div class='box'>");
		out.println("<h2>TÍNH CHỈ SỐ BMI</h2>");
		out.println("<form method='post' action='BMI'>");
		out.println("Chiều cao (m): <input type='number' step='0.01' name='height' required>");
		out.println("Cân nặng (kg): <input type='number' step='0.1' name='weight' required>");
		out.println("<button type='submit'>Tính BMI</button>");
		out.println("</form>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		double height = Double.parseDouble(request.getParameter("height"));
		double weight = Double.parseDouble(request.getParameter("weight"));

		double bmi = weight / (height * height);
		String result;

		if (bmi < 18.5) {
			result = "Gầy";
		} else if (bmi < 24.9) {
			result = "Bình thường";
		} else if (bmi < 29.9) {
			result = "Thừa cân";
		} else {
			result = "Béo phì";
		}

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Kết quả BMI</title>");
		out.println("</head>");
		out.println("<body style='font-family: Arial;'>");

		out.println("<h2>KẾT QUẢ BMI</h2>");
		out.println("<p>Chiều cao: " + height + " m</p>");
		out.println("<p>Cân nặng: " + weight + " kg</p>");
		out.println("<p><b>BMI: " + String.format("%.2f", bmi) + "</b></p>");
		out.println("<p><b>Phân loại: " + result + "</b></p>");

		out.println("<a href='BMI'>Quay lại</a>");

		out.println("</body>");
		out.println("</html>");
	}

}
