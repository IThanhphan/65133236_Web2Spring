package thiGK.ntu65133236.phansithanh_fitCMS.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import thiGK.ntu65133236.phansithanh_fitCMS.models.Page;
import thiGK.ntu65133236.phansithanh_fitCMS.models.Post;

@Controller
public class HomeController {
	ArrayList<Page> dsTrang = new ArrayList<Page>();
	ArrayList<Post> dsBaiViet = new ArrayList<Post>();

	public HomeController() {

		dsTrang.add(new Page(1, "Trang sinh viên", "student", "Trang chính giới thiệu thông tin sinh viên", null));
		dsTrang.add(new Page(2, "Thông tin cá nhân", "profile", "Thông tin cá nhân của sinh viên", "1"));
		dsTrang.add(new Page(3, "Quá trình học tập", "education", "Thông tin về quá trình học tập của sinh viên", "1"));

		dsBaiViet.add(new Post("1", "Giới thiệu bản thân",
				"Sinh viên ngành Công nghệ Thông tin tại Trường Đại học Nha Trang, yêu thích lập trình web và phát triển phần mềm.",
				"1"));

		dsBaiViet.add(new Post("2", "Kỹ năng lập trình",
				"Có kinh nghiệm với Java, JavaScript, HTML, CSS và SQL Server. Đã thực hiện nhiều dự án nhỏ về web và ứng dụng.",
				"1"));

		dsBaiViet.add(new Post("3", "Dự án cá nhân",
				"Đã thực hiện các dự án như website bán xe cũ, ứng dụng chat Flutter và hệ thống chỉnh sửa ảnh bằng FastAPI.",
				"2"));
	}

	@GetMapping("/")
	public String homePage() {
		return "homePage";
	}

	@GetMapping("/page/all")
	public String getTatCaTrang(ModelMap m) {
		m.addAttribute("lstPages", dsTrang);
		return "allpage";
	}

}
