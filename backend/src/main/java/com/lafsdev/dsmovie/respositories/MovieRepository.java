package com.lafsdev.dsmovie.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lafsdev.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
