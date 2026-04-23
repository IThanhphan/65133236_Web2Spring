package thigk2.phansithanh.qltt.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tin_tuc")
public class TinTuc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, name = "tieu_de")
	private String tieuDe;

	@Column(columnDefinition = "TEXT", name = "noi_dung")
	private String noiDung;

	@Column(name = "ngay_dang")
	private LocalDateTime ngayDang = LocalDateTime.now();

	@ManyToOne
	@JoinColumn(name = "loai_tin_id")
	private LoaiTinTuc loaiTinTuc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public LocalDateTime getNgayDang() {
		return ngayDang;
	}

	public void setNgayDang(LocalDateTime ngayDang) {
		this.ngayDang = ngayDang;
	}

	public LoaiTinTuc getLoaiTinTuc() {
		return loaiTinTuc;
	}

	public void setLoaiTinTuc(LoaiTinTuc loaiTinTuc) {
		this.loaiTinTuc = loaiTinTuc;
	}

}
