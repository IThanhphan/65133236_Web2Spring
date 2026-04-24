package thigk2.phansithanh.qlsp.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thigk2.phansithanh.qlsp.Models.SanPham;
import thigk2.phansithanh.qlsp.Repositorys.SanPhamRepository;

@Service
public class SanPhamService {
	@Autowired
	private SanPhamRepository repository;

	public List<SanPham> getSanPhamsByLoai(Integer loaiId) {
		return repository.findByLoaiSanPhamId(loaiId);
	}

	public List<SanPham> getAllSanPham() {
		return repository.findAll();
	}

	public SanPham getSanPhamById(Integer id) {
		Optional<SanPham> optional = repository.findById(id);
		return optional.orElse(null);
	}
}
