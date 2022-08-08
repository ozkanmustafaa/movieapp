package com.ozkan.movie.service;

import com.ozkan.movie.data.repository.MovieRepositoryIF;
import com.ozkan.movie.dto.MovieDTO;
import com.ozkan.movie.mapper.MovieMapperIF;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl {
    private final MovieMapperIF movieMapperIF;
    private final MovieRepositoryIF movieRepositoryIF;

    public MovieServiceImpl(MovieMapperIF movieMapperIF, MovieRepositoryIF movieRepositoryIF) {
        this.movieMapperIF = movieMapperIF;
        this.movieRepositoryIF = movieRepositoryIF;
    }

    public MovieDTO findByName(String name){
        return movieMapperIF.toMovieDTO(movieRepositoryIF.findByName(name));
    }

    public MovieDTO findByRating(long rating){
        return movieMapperIF.toMovieDTO(movieRepositoryIF.findByRating(rating));
    }

    public List<MovieDTO> findByNameContains(String name){
        return movieMapperIF.toMovieDTOList(movieRepositoryIF.findByNameContains(name));
    }
}
