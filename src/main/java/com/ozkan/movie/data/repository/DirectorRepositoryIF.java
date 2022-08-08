package com.ozkan.movie.data.repository;

import com.ozkan.movie.data.entity.Director;
import org.springframework.data.repository.CrudRepository;

public interface DirectorRepositoryIF extends CrudRepository<Director, Integer> {
    Director findByFirstName(String name);
}
