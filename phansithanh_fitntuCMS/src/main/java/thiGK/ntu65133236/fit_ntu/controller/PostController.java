package thiGK.ntu65133236.fit_ntu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import thiGK.ntu65133236.fit_ntu.model.Post;
import thiGK.ntu65133236.fit_ntu.service.PostService;

@Controller
@RequestMapping("/post")
public class PostController {

	private final PostService service;

	public PostController(PostService service) {
		this.service = service;
	}

	@GetMapping("/all")
	public String list(Model model) {
		model.addAttribute("posts", service.findAll());
		return "post-list";
	}

	@GetMapping("/new")
	public String form(Model model) {
		model.addAttribute("post", new Post());
		return "post-form";
	}

	@PostMapping("/save")
	public String save(Post post) {
		service.save(post);
		return "redirect:/post/all";
	}

	@GetMapping("/view/{id}")
	public String view(@PathVariable Long id, Model model) {
		model.addAttribute("post", service.findById(id));
		return "post-view";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		service.delete(id);
		return "redirect:/post/all";
	}
}