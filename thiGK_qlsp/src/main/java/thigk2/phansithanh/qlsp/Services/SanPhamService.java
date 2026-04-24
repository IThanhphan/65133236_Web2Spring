package thigk2.phansithanh.qlsp.Services;

import java.util.List;

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
}
