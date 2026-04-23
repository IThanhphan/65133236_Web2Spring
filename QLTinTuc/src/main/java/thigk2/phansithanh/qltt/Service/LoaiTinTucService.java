package thigk2.phansithanh.qltt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thigk2.phansithanh.qltt.Model.LoaiTinTuc;
import thigk2.phansithanh.qltt.Repos.LoaiTinTucRepository;

@Service
public class LoaiTinTucService {
	@Autowired
	private LoaiTinTucRepository repo;

	public List<LoaiTinTuc> findAll() {
		return repo.findAll();
	}

	public LoaiTinTuc save(LoaiTinTuc loai) {
		return repo.save(loai);
	}

	public void deleteById(Integer id) {
		repo.deleteById(id);
	}
}
