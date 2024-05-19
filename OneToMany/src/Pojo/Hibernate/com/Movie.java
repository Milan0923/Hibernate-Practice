package Pojo.Hibernate.com;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table

public class Movie {

	@Id
	@Column
	@GeneratedValue
		
	private int MovieId;

	@Column(length=20)
	private String MovieName;

	@Column
	private Date releaseDate;

	@Column
	private double budget ;

	@ManyToOne
	@JoinColumn(name="directorId") //foreign key	
	private Director dier;

	public int getMovieId() {
		return MovieId;
	}

	public void setMovieId(int movieId) {
		MovieId = movieId;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public Director getDier() {
		return dier;
	}

	public void setDier(Director dier) {
		this.dier = dier;
	}

	public Movie() {
		super();
	}

	public Movie( String movieName, Date releaseDate, double budget, Director dier) {
		super();
		
		MovieName = movieName;
		this.releaseDate = releaseDate;
		this.budget = budget;
		this.dier = dier;
	}

	@Override
	public String toString() {
		return "Movie [MovieId=" + MovieId + ", MovieName=" + MovieName + ", releaseDate=" + releaseDate + ", budget="
				+ budget + ", dier=" + dier + "]";
	}

}
