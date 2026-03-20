package thiGK.ntu65133236.phansithanh_fitCMS.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import thiGK.ntu65133236.phansithanh_fitCMS.models.Page;
import thiGK.ntu65133236.phansithanh_fitCMS.services.PageService;

@RestController
public class RESTApiPageController {
	@Autowired
	PageService pService;

	@GetMapping("/restAPI/page/all")
	public List<Page> getAllPage() {
		List<Page> dsTrang = new ArrayList<Page>();
//		dsTrang.add(new Page(0, "tenTrang", "tukhoa", "noidung", "0"));
		dsTrang = pService.getAllPage();
		return dsTrang;
	}

	@GetMapping("/restAPI/page/{id}")
	public Page getPage(@PathVariable("id") int id) {
		return pService.getPageByID(id);
	}
}
