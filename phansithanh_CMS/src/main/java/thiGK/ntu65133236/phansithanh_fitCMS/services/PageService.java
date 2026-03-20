package thiGK.ntu65133236.phansithanh_fitCMS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiGK.ntu65133236.phansithanh_fitCMS.models.Page;
import thiGK.ntu65133236.phansithanh_fitCMS.repositories.PageRepository;

@Service
public class PageService {
	@Autowired
	PageRepository pRepos;

	// Dịch vụ lấy về tất cả các trang
	public List<Page> getAllPage() {
		return pRepos.findAll();
	}

	// Dịch vụ lấy thông tin 1 trang, theo id
	public Page getPageByID(int id) {
		return pRepos.getById(id);
	}

}
