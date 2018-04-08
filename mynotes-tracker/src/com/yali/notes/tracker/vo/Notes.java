package com.yali.notes.tracker.vo;

import java.util.Date;

public class Notes {

	private String title;
	private String content;
	private Date date;

	public Notes(String title, String content, Date date) {
		super();
		this.title = title;
		this.content = content;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Notes [title=" + title + ", content=" + content + ", date=" + date + "]";
	}

}
