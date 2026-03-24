package thiGK.ntu65133236.fit_ntu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import thiGK.ntu65133236.fit_ntu.model.Page;
import thiGK.ntu65133236.fit_ntu.service.PageService;

@Controller
@RequestMapping("/page")
public class PageController {

	private final PageService service;

	public PageController(PageService service) {
		this.service = service;
	}

	@GetMapping("/all")
	public String list(Model model) {
		model.addAttribute("pages", service.findAll());
		return "page-list";
	}

	@GetMapping("/new")
	public String form(Model model) {
		model.addAttribute("page", new Page());
		return "page-form";
	}

	@PostMapping("/save")
	public String save(Page page) {
		service.save(page);
		return "redirect:/page/all";
	}

	@GetMapping("/view/{id}")
	public String view(@PathVariable Long id, Model model) {
		model.addAttribute("page", service.findById(id));
		return "page-view";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		service.delete(id);
		return "redirect:/page/all";
	}
}