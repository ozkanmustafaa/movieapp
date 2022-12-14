package com.ozkan.movie.data.repository;

import com.ozkan.movie.data.entity.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepositoryIF extends CrudRepository<Movie, Integer> {
    Movie findByName(String name);
    List<Movie> findByNameContains(String name);
    List<Movie> findByImdbGreaterThan(double point);


}
