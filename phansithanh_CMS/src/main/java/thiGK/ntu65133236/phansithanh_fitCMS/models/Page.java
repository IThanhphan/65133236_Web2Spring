package thiGK.ntu65133236.phansithanh_fitCMS.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "page")
public class Page {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "page_name")
	String pageName;

	@Column(name = "keyword")
	String keyword;

	@Column(name = "content")
	String content;

	@Column(name = "parent_page_id")
	String parentPageId;

	public Page(int id, String pageName, String keyword, String content, String parentPageId) {
		this.id = id;
		this.pageName = pageName;
		this.keyword = keyword;
		this.content = content;
		this.parentPageId = parentPageId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getParentPageId() {
		return parentPageId;
	}

	public void setParentPageId(String parentPageId) {
		this.parentPageId = parentPageId;
	}

}
