package com.cg.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.cg.movie.beans.Movie;
import com.cg.movie.beans.Song;
import com.cg.movie.exceptions.MovieNotFoundException;
import com.cg.movie.exceptions.SongNotFoundException;
import com.cg.movie.services.movieServices;

@Controller
public class movieServicesController {

	@Autowired
	public movieServices services;

	@RequestMapping(value= {"/addmovie"},method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, 
			headers="Accept=application/json") 
	public ResponseEntity<Movie> addMovie(@ModelAttribute Movie movie) { movie=services.addMovie(movie);
	return new ResponseEntity<Movie>(movie,HttpStatus.OK); 
	}

	@RequestMapping(value= {"/findAllmovies"},method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE, headers="Accept=application/json")
	public ResponseEntity<List<Movie>>getAllMoviesPathParam () { 
		return new ResponseEntity<List<Movie>>(services.getAllMovies(),HttpStatus.OK); 
	}

	@RequestMapping(value= {"/addSong"},method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces=MediaType.APPLICATION_JSON_VALUE, headers="Accept=application/json") 
	public ResponseEntity<Song> addSong(@RequestParam String movieName,@RequestParam String songName,@RequestParam String singer,@RequestParam String lyricist) throws MovieNotFoundException {
		Song song=services.addSong(movieName,songName,singer,lyricist);
		return new ResponseEntity<Song>(song,HttpStatus.OK); 
	}

	@RequestMapping(value= {"/getSong"},method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE, headers="Accept=application/json")
	public ResponseEntity<Song> getSong(@RequestParam String songName) throws SongNotFoundException { 
		Song song=services.getSong(songName);
		return new ResponseEntity<Song>(song,HttpStatus.OK); 
	}
	
	@RequestMapping(value= {"/getAllSongs"},method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE, headers="Accept=application/json")
	public ResponseEntity<List<Song>>getAllSongsPathParam(@RequestParam String movieName) { 
		return new ResponseEntity<List<Song>>(services.getAllSongs(movieName),HttpStatus.OK); 
	}
	
	@RequestMapping(value= {"/getMovie"},method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE, headers="Accept=application/json")
	public ResponseEntity<Movie> getMovie(@RequestParam String movieName) throws MovieNotFoundException { 
		Movie movie=services.getMovie(movieName);
		return new ResponseEntity<Movie>(movie,HttpStatus.OK); 
	}
	@RequestMapping(value= {"/removeSong"}, method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE, headers="Accept=application/json")
		public  ResponseEntity<String> removeSong(@RequestParam String songName) throws SongNotFoundException {
		services.removeSong(songName);
		return new ResponseEntity<String>("Song has been successfully removed",HttpStatus.OK); 
	}
	@RequestMapping(value= {"/removeMovie"}, method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE, headers="Accept=application/json")
	public  ResponseEntity<String> removeMovie(@RequestParam String movieName) throws SongNotFoundException, MovieNotFoundException {
	services.removeMovie(movieName);
	return new ResponseEntity<String>("Song has been successfully removed",HttpStatus.OK); 
}
		
	}
	






