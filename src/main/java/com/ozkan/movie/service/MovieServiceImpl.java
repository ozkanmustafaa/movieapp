package com.ozkan.movie.service;

import com.ozkan.movie.data.entity.Director;
import com.ozkan.movie.data.entity.Movie;
import com.ozkan.movie.data.repository.DirectorRepositoryIF;
import com.ozkan.movie.data.repository.MovieRepositoryIF;
import com.ozkan.movie.dto.DirectorDTO;
import com.ozkan.movie.dto.MovieDTO;
import com.ozkan.movie.mapper.MovieMapperIF;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;

@Service
public class MovieServiceImpl {
    private final MovieMapperIF movieMapperIF;
    private final MovieRepositoryIF movieRepositoryIF;
    private final DirectorRepositoryIF directorRepositoryIF;

    public MovieServiceImpl(MovieMapperIF movieMapperIF, MovieRepositoryIF movieRepositoryIF, DirectorRepositoryIF directorRepositoryIF) {
        this.movieMapperIF = movieMapperIF;
        this.movieRepositoryIF = movieRepositoryIF;
        this.directorRepositoryIF = directorRepositoryIF;
    }

    public MovieDTO findByMovieId(int id) {
        return movieMapperIF.toMovieDTO(movieRepositoryIF.findById(id).orElseGet(Movie::new));
    }

    public MovieDTO findByMovieName(String name){
        return movieMapperIF.toMovieDTO(movieRepositoryIF.findByName(name));
    }

    public List<MovieDTO> findByImdbGreaterThan(double point){
        return movieMapperIF.toMovieDTOList(movieRepositoryIF.findByImdbGreaterThan(point));
    }

    public List<MovieDTO> findByMovieNameContains(String name){
        return movieMapperIF.toMovieDTOList(movieRepositoryIF.findByNameContains(name));
    }

    public DirectorDTO findByDirectorId(int id){
        return movieMapperIF.toDirectorDTO(directorRepositoryIF.findById(id).orElseGet(Director::new));
    }
    public DirectorDTO findByDirectorName(String name){
        return movieMapperIF.toDirectorDTO(directorRepositoryIF.findByFirstName(name));
    }
}
