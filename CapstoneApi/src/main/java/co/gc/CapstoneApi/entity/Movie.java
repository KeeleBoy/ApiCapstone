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

	private boolean favorite;

	@Override
	public String toString() {
		return "Movie [id=" + id + ", favorite=" + favorite + ", title=" + title + ", year=" + year + ", imdbID="
				+ imdbID + ", genre=" + genre + ", actors=" + actors + ", director=" + director + ", imdbRating="
				+ imdbRating + ", Type=" + Type + "]";
	}

	public boolean getFavorite() {
		return favorite;
	}

	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}

	@JsonProperty("Title")
	private String title;

	@JsonProperty("Year")
	private String year;

	private String imdbID;

	@JsonProperty("Genre")
	private String genre;

	@JsonProperty("Actors")
	private String actors;

	@JsonProperty("Director")
	private String director;

	@JsonProperty("imdbRating")
	private String imdbRating;

	@JsonProperty("Type")
	private String Type;

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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
