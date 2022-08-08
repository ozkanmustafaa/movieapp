package com.ozkan.movie.controller;

import com.ozkan.movie.dto.DirectorDTO;
import com.ozkan.movie.dto.MovieDTO;
import com.ozkan.movie.service.MovieServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/movieapp")
public class MovieController {
    private final MovieServiceImpl movieServiceImpl;

     public MovieController(MovieServiceImpl movieServiceImpl) {
        this.movieServiceImpl = movieServiceImpl;
    }


    @GetMapping("find/movie/id")
    public MovieDTO findByMovieId (@RequestParam(value = "id") int id){
        return movieServiceImpl.findByMovieId(id);
    }

    @GetMapping("find/movie/name")
    public MovieDTO findByMovieName (@RequestParam(value = "n") String name){
        return movieServiceImpl.findByMovieName(name);
    }

    @GetMapping("find/movie/name/contains")
    public List<MovieDTO> findByMovieNameContains (@RequestParam(value = "c") String name){
        return movieServiceImpl.findByMovieNameContains(name);
    }

    @GetMapping("find/movie/point")
    public List<MovieDTO> findByImdbGreaterThan (@RequestParam(value = "p") double point){
        return movieServiceImpl.findByImdbGreaterThan(point);
    }

    @GetMapping("find/director/id")
    public DirectorDTO findById(@RequestParam(value = "id") int id){
         return movieServiceImpl.findByDirectorId(id);
    }

    @GetMapping("find/director/name")
    public DirectorDTO findByDirectorName (@RequestParam(value = "n") String name){
        return movieServiceImpl.findByDirectorName(name);
    }


}
