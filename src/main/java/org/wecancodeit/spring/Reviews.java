package org.wecancodeit.spring;

public class Reviews {
	
	


  
	private long id;
	private String title;
	private String content; 
	public String imageUrl;
	private String category;
	
	public Reviews(long id, String title,  String content, String imageUrl, String category) {
	this.id = id;
	this.title =title;
	this.content = content;
	this.imageUrl = imageUrl;
	this.category = category;
	
	}
	public long getId() {
		return id;
	}
	

	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
		
	}
    public String getimageUrl() {
		return imageUrl;

		
	}
	public String getCategory() {
		return category;
	}
}