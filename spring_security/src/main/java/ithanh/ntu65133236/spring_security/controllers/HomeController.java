package ithanh.ntu65133236.spring_security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "Home";
	}

	@GetMapping("/products/")
	public String indexP() {
		return "sanpham";
	}

	@GetMapping("/admincp/")
	public String indexAd() {
		return "indexAdmin";
	}

	@GetMapping("/hello")
	public String hi() {
		return "hello";
	}

	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
}