package com.cg.movie.services;

import java.util.List;

import com.cg.movie.beans.Movie;
import com.cg.movie.beans.Song;
import com.cg.movie.exceptions.MovieNotFoundException;
import com.cg.movie.exceptions.SongNotFoundException;

public interface movieServices {
	
	 Movie addMovie(Movie movie);
	 Song addSong(String movieName,String songName,String singer,String lyricist) throws MovieNotFoundException;
	 Song getSong(String songName) throws SongNotFoundException;
	 Movie getMovie(String movieName)  throws MovieNotFoundException;
	 List<Song> getAllSongs(String movieName);
	 List<Movie> getAllMovies();
	 boolean removeMovie(String movieName) throws MovieNotFoundException;
	 boolean removeSong(String songName) throws SongNotFoundException;
}
