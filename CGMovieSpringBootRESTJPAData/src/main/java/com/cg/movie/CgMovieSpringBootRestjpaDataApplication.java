package com.cg.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages= {"com.cg.movie"})
@EntityScan(basePackages="com.cg.movie.beans")
@EnableJpaRepositories(basePackages="com.cg.movie.dao")
public class CgMovieSpringBootRestjpaDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CgMovieSpringBootRestjpaDataApplication.class, args);
	}

}
