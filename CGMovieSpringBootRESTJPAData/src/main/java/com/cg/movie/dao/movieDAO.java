package com.cg.movie.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.movie.beans.Movie;
import com.cg.movie.beans.Song;

public interface movieDAO extends JpaRepository<Movie, String> {

	@Query(value="from Song s where s.movie.movieName=:movieName")
	List<Song> findAllSongs(@Param("movieName") String movieName);

}
