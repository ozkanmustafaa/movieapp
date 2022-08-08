package com.ozkan.movie.controller;

import com.ozkan.movie.dto.MovieDTO;
import com.ozkan.movie.service.MovieServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/movie")
public class MovieController {
    private final MovieServiceImpl movieServiceImpl;

     public MovieController(MovieServiceImpl movieServiceImpl) {
        this.movieServiceImpl = movieServiceImpl;
    }

    @GetMapping("find/name")
    public MovieDTO findByName (@RequestParam(value = "n") String name){
        return movieServiceImpl.findByName(name);
    }

    @GetMapping("test")
    public String findByTest (@RequestParam(value = "n") String name){
        return "Mustafa" + name;
    }

    @GetMapping("find/rating")
    public MovieDTO findById (@RequestParam(value = "rt") long rating){
        return movieServiceImpl.findByRating(rating);
    }

    @GetMapping("find/name/contains")
    public List<MovieDTO> findByNameContains (@RequestParam(value = "c") String name){
        return movieServiceImpl.findByNameContains(name);
    }

}
