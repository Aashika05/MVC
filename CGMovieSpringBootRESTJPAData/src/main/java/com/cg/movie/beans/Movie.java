package com.cg.movie.beans;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

@Entity
public class Movie {
@Id
private String movieName;
private String director,producer;

@OneToMany(mappedBy="movie")
@MapKey
public Map<String, Song> song =  new HashMap<String, Song>();

public Movie() {}

public Movie(String movieName, String director, String producer, Map<String, Song> song) {
	super();
	this.movieName = movieName;
	this.director = director;
	this.producer = producer;
	this.song = song;
}

public String getMovieName() {
	return movieName;
}

public void setMovieName(String movieName) {
	this.movieName = movieName;
}

public String getDirector() {
	return director;
}

public void setDirector(String director) {
	this.director = director;
}

public String getProducer() {
	return producer;
}

public void setProducer(String producer) {
	this.producer = producer;
}

public Map<String, Song> getSong() {
	return song;
}

public void setSong(Map<String, Song> song) {
	this.song = song;
}


}
