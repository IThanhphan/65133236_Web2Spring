package thigk2.phansithanh.qlsp.Repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import thigk2.phansithanh.qlsp.Models.SanPham;

public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
	List<SanPham> findByLoaiSanPhamId(Integer loaiId);
}
