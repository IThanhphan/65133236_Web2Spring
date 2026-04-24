package thigk2.phansithanh.qlsp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thigk2.phansithanh.qlsp.Models.SanPham;
import thigk2.phansithanh.qlsp.Services.SanPhamService;

@RestController
@RequestMapping("/api/san-pham")
public class SanPhamController {

	@Autowired
	private SanPhamService service;

	@GetMapping("/loai/{loaiId}")
	public ResponseEntity<List<SanPham>> listByLoai(@PathVariable Integer loaiId) {
		List<SanPham> sanPhams = service.getSanPhamsByLoai(loaiId);

		if (sanPhams.isEmpty()) {
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.ok(sanPhams);
	}
}
