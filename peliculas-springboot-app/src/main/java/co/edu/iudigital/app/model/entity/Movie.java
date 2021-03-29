package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="movie_id")
	private int id;
	private String name,description,image;
	
	@Column(name="created")
	private LocalDateTime Created;
	
	@Column(name="release_date")
	private LocalDate releasedata;
	
	private String actors;
	
	
	@ManyToOne
	@JoinColumn(name="gender_id")
	private Gender genderId;
	
		
	private int rating;


	public Movie(int id, String name, String description, String image, LocalDateTime created, LocalDate releasedata,
			String actors, Gender genderId, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		Created = created;
		this.releasedata = releasedata;
		this.actors = actors;
		this.genderId = genderId;
		this.rating = rating;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public LocalDateTime getCreated() {
		return Created;
	}


	public void setCreated(LocalDateTime created) {
		Created = created;
	}


	public LocalDate getReleasedata() {
		return releasedata;
	}


	public void setReleasedata(LocalDate releasedata) {
		this.releasedata = releasedata;
	}


	public String getActors() {
		return actors;
	}


	public void setActors(String actors) {
		this.actors = actors;
	}


	public Gender getGenderId() {
		return genderId;
	}


	public void setGenderId(Gender genderId) {
		this.genderId = genderId;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}
