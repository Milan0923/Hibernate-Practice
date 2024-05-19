package Pojo.Hibernate.com;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table

public class Director {

	@Id
	@Column
	private int directorId;
	
	@Column(length=20)
	private String directorName;
	
	@OneToMany(mappedBy="dier",cascade=CascadeType.ALL)
	private Set<Movie> movie;

	public int getDirectorId() {
		return directorId;
	}

	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public Set<Movie> getMovie() {
		return movie;
	}

	public void setMovie(Set<Movie> movie) {
		this.movie = movie;
	}

	public Director(int directorId, String directorName, Set<Movie> movie) {
		super();
		this.directorId = directorId;
		this.directorName = directorName;
		this.movie = movie;
	}

	public Director() {
		super();
	}

	@Override
	public String toString() {
		return "Director [directorId=" + directorId + ", directorName=" + directorName + ", movie=" + movie + "]";
	}
}
