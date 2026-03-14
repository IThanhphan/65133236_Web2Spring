package thiGK.ntu65133236.phansithanh_fitCMS.models;

public class Page {
	int id;
	String pageName, keyword, content, parentPageId;

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
