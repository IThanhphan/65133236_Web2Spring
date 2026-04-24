package thigk2.phansithanh.qlsp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thigk2.phansithanh.qlsp.Models.LoaiSanPham;
import thigk2.phansithanh.qlsp.Models.SanPham;
import thigk2.phansithanh.qlsp.Services.LoaiSanPhamService;
import thigk2.phansithanh.qlsp.Services.SanPhamService;

@Controller
@RequestMapping("/san-pham")
public class SanPhamViewController {

	@Autowired
	private SanPhamService sanPhamService;

	@Autowired
	private LoaiSanPhamService loaiSanPhamService;

	@GetMapping("/danh-sach")
	public String hienThiDanhSach(Model model) {
		List<SanPham> listSanPham = sanPhamService.getAllSanPham();
		model.addAttribute("dsSanPham", listSanPham);
		return "danhSachSanPham";
	}

	@GetMapping("/loc-theo-loai")
	public String locTheoLoai(@RequestParam(name = "loaiId", required = false) Integer loaiId, Model model) {

		List<LoaiSanPham> dsLoai = loaiSanPhamService.getAllLoaiSanPham();
		model.addAttribute("dsLoai", dsLoai);

		List<SanPham> dsSanPham;
		if (loaiId != null) {
			dsSanPham = sanPhamService.getSanPhamsByLoai(loaiId);
			model.addAttribute("selectedLoaiId", loaiId);
		} else {
			dsSanPham = sanPhamService.getAllSanPham();
		}

		model.addAttribute("dsSanPham", dsSanPham);

		return "sanPhamTheoLoai";
	}

	@GetMapping("/chi-tiet/{id}")
	public String xemChiTiet(@PathVariable("id") Integer id, Model model) {
		SanPham sp = sanPhamService.getSanPhamById(id);

		if (sp == null) {
			return "error/404";
		}

		model.addAttribute("sanPham", sp);
		return "chiTietSanPham";
	}
}
