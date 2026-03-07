package clc65.ithanhphan.b5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {
	@GetMapping("/")
	public String showSinhVien(ModelMap m) {
		SinhVien sv1 = new SinhVien("65133236", "Si Thanh", "2005", "Nam");
		m.addAttribute("sv", sv1);
		// return "detail";
		return "detail";
	}
}