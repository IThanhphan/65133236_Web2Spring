package thiGK.ntu65133236.fit_ntu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import thiGK.ntu65133236.fit_ntu.model.Page;
import thiGK.ntu65133236.fit_ntu.repository.PageRepository;

@Service
public class PageService {

	private final PageRepository repo;

	public PageService(PageRepository repo) {
		this.repo = repo;
	}

	public List<Page> findAll() {
		return repo.findAll();
	}

	public Page findById(Long id) {
		return repo.findById(id).orElse(null);
	}

	public void save(Page page) {
		repo.save(page);
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}