package thigk2.phansithanh.qltt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CRUDController {
	@GetMapping("/admin")
	public String home(Model model) {
		return "indexAdmin";
	}

}
