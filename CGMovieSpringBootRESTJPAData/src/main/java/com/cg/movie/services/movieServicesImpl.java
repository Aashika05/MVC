package com.cg.movie.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.movie.beans.Movie;
import com.cg.movie.beans.Song;
import com.cg.movie.dao.movieDAO;
import com.cg.movie.dao.songDAO;
import com.cg.movie.exceptions.MovieNotFoundException;
import com.cg.movie.exceptions.SongNotFoundException;
@Component("movieServices")
public class movieServicesImpl implements movieServices{

	@Autowired
	movieDAO moviedaoServices;
	@Autowired
	songDAO songdaoServices;

	@Override
	public Movie addMovie(Movie movie) {
		return moviedaoServices.save(movie);
	}

	@Override
	public Song addSong(String movieName, String songName,String singer,String lyricist) throws MovieNotFoundException{
		Movie movie=getMovie(movieName);
		return songdaoServices.save(new Song(movie,songName,singer,lyricist));
	}

	@Override
	public Song getSong(String songName) throws SongNotFoundException {
		return songdaoServices.findById(songName).orElseThrow(()-> new SongNotFoundException("Cant find this song"));
	}


	@Override
	public List<Movie> getAllMovies() {
		return moviedaoServices.findAll();

	}

	@Override
	public boolean removeMovie(String movieName) throws MovieNotFoundException {
		moviedaoServices.delete(getMovie(movieName));
		return true;

	}

	@Override
	public boolean removeSong(String songName) throws SongNotFoundException {
		songdaoServices.delete(getSong(songName));
		return true;
	}

	@Override
	public List<Song> getAllSongs(String movieName) {
		return new ArrayList<Song>(moviedaoServices.findAllSongs(movieName));
	}


	@Override
	public Movie getMovie(String movieName) throws MovieNotFoundException {
		return moviedaoServices.findById(movieName).orElseThrow(()-> new MovieNotFoundException("Cant find this movie"));
	}

}
