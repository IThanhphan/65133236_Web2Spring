package thigk2.phansithanh.qlsp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thigk2.phansithanh.qlsp.Models.LoaiSanPham;
import thigk2.phansithanh.qlsp.Services.LoaiSanPhamService;

@RestController
@RequestMapping("/api/loai-san-pham")
public class LoaiSanPhamController {
	@Autowired
	private LoaiSanPhamService service;

	@GetMapping
	public ResponseEntity<List<LoaiSanPham>> list() {
		List<LoaiSanPham> categories = service.getAllLoaiSanPham();
		return ResponseEntity.ok(categories);
	}
}
