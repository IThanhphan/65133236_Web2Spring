package thiGK.ntu65133236.phansithanh_fitCMS.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import thiGK.ntu65133236.phansithanh_fitCMS.models.Page;

@RestController
public class APIPageController {
	ArrayList<Page> dsTrang = new ArrayList<Page>();

	public APIPageController() {

		dsTrang.add(new Page(1, "Trang sinh viên", "student", "Trang chính giới thiệu thông tin sinh viên", null));
		dsTrang.add(new Page(2, "Thông tin cá nhân", "profile", "Thông tin cá nhân của sinh viên", "1"));
		dsTrang.add(new Page(3, "Quá trình học tập", "education", "Thông tin về quá trình học tập của sinh viên", "1"));
	}

	@GetMapping("/api/pages")
	public ArrayList<Page> getAllPage() {
		return dsTrang;
	}

	@GetMapping("/api/page/{id}")
	public Page getPage(@PathVariable("id") int id) {
		for (Page p : dsTrang) {
			if (p.getId() == id)
				return p;
		}
		return null;
	}

	@PutMapping("/api/page/update/{id}")
	public boolean putMethodName(@PathVariable("id") int id, @RequestBody Page entity) {
		for (Page p : dsTrang) {
			if (p.getId() == id) {
				dsTrang.remove(id);
				dsTrang.add(entity);
				return true;
			}
		}

		return false;

	}

	@PostMapping("/api/page/add")
	public boolean postMethodName(@RequestBody Page entity) {

		return dsTrang.add(entity);
	}

	@DeleteMapping("/api/page/delete/{id}")
	public boolean pageDelete(@PathVariable("id") int id) {
		for (Page p : dsTrang) {
			if (p.getId() == id) {
				dsTrang.remove(id);
				return true;
			}
		}
		return false;
	}
}
