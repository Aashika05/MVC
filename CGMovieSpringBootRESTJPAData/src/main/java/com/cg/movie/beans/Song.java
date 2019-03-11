package com.cg.movie.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Song {
@Id
private String songName;
private String singer,lyricist;
public Song() {}

public Song(Movie movie,String songName, String singer, String lyricist) {
	super();
	this.movie = movie;
	this.songName = songName;
	this.singer = singer;
	this.lyricist = lyricist;
	
}
@ManyToOne
@JsonIgnore
private Movie movie;

public Movie getMovie() {
	return movie;
}

public String getSongName() {
	return songName;
}

public void setSongName(String songName) {
	this.songName = songName;
}

public String getSinger() {
	return singer;
}

public void setSinger(String singer) {
	this.singer = singer;
}

public String getLyricist() {
	return lyricist;
}

public void setLyricist(String lyricist) {
	this.lyricist = lyricist;
}
}