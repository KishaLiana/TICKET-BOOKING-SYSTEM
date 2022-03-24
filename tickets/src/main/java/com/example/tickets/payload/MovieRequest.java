package com.example.tickets.payload;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class MovieRequest {
	@NotBlank
	@Size(min = 4, max = 40)
	private String title;

	@NotBlank
	@Size(min = 10, max = 15000)
	private String description;

	
	private Date date;

	@NotBlank
	@Size(max = 10)
	private String time;

	@NotBlank
	@Size(max = 100)
	private String price;

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
