package co.gc.CapstoneApi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonProperty("Title")
	private String title;

	@JsonProperty("Year")
	private String year;
	
	private String imdbID;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}



	@Override
	public String toString() {
		return "Movie [Title=" + title + ", Year=" + year + ", imdbID=" + imdbID + "]";
	}

	

}
