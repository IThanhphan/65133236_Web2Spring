package thiGK.ntu65133236.fit_ntu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

	@GetMapping({ "/", "/dashboard" })
	public String dashboard() {
		return "dashboard";
	}
}