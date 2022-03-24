package com.example.tickets.model;

import com.example.tickets.model.audit.DateAudit;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Date;

@Entity
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = { "username" }),
		@UniqueConstraint(columnNames = { "email" }) })
public class Ticket extends DateAudit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne()
	private Movie movie;

	/*
	 * @NotBlank
	 * 
	 * @Size(max = 50) private String movieTitle;
	 */

	@NotNull
	private Date date;

	@NotBlank
	@Size(max = 100)
	private String seatNumber;

	public Ticket() {

	}

	public Ticket(Long id, @NotNull Date date, @NotBlank @Size(max = 100) String seatNumber) {
		super();
		this.id = id;
		// this.movieTitle = movieTitle;
		this.date = date;
		this.seatNumber = seatNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

}
