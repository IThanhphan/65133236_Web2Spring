package thigk2.phansithanh.qlsp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thigk2.phansithanh.qlsp.Models.LoaiSanPham;
import thigk2.phansithanh.qlsp.Repositorys.LoaiSanPhamRepository;

@Service
public class LoaiSanPhamService {
	@Autowired
	private LoaiSanPhamRepository repository;

	public List<LoaiSanPham> getAllLoaiSanPham() {
		return repository.findAll();
	}
}
