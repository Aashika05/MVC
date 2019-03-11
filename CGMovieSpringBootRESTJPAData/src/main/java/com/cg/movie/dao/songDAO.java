package com.cg.movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.movie.beans.Song;
public interface songDAO extends JpaRepository<Song, String> {
	/*
	 * @Query(value="from Song a where a.movie.movieName=:movieName") List<Song>
	 * findAllSongs(@Param("movieName") String movieName);
	 */
}
