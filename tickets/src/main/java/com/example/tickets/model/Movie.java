package com.example.tickets.model;

import com.example.tickets.model.audit.DateAudit;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import java.util.Date;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "movieTitle"
        })
})
public class Movie extends DateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 1000)
    private String movieTitle;

    @NotBlank
    @Size(max = 10000)
    private String description;

    
    private Date date;
    
    @NotBlank
    @Size(max = 15)
    private String time;
    
    @NotBlank
    @Size(max = 100)
    private String price;

   
    public Movie () {
    }


	public Movie(Long id, @NotBlank @Size(max = 50) String movieTitle, @NotBlank @Size(max = 10000) String description,
			@NotBlank @Size(max = 15) Date date, @NotBlank @Size(max = 15) String time,
			@NotBlank @Size(max = 100) String price) {
		super();
		this.id = id;
		this.movieTitle = movieTitle;
		this.description = description;
		this.date = date;
		this.time = time;
		this.price = price;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getMovieTitle() {
		return movieTitle;
	}


	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
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