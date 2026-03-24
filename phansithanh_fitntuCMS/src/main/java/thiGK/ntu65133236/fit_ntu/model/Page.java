package thiGK.ntu65133236.fit_ntu.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "page")
public class Page {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "page_name")
	private String pageName;

	private String keyword;

	@Column(columnDefinition = "TEXT")
	private String content;

	@Column(name = "parent_page_id")
	private Long parentPageId;

	// getter setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getParentPageId() {
		return parentPageId;
	}

	public void setParentPageId(Long parentPageId) {
		this.parentPageId = parentPageId;
	}
}