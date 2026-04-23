package thigk2.phansithanh.qltt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thigk2.phansithanh.qltt.Model.TinTuc;
import thigk2.phansithanh.qltt.Repos.TinTucRepository;

@Service
public class TinTucService {
	@Autowired
	private TinTucRepository repo;

	public List<TinTuc> findAll() {
		return repo.findAll();
	}

	public TinTuc save(TinTuc tin) {
		return repo.save(tin);
	}

	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

	public TinTuc findById(Integer id) {
		return repo.findById(id).orElse(null);
	}
}
