package com.ozkan.movie.dto;

import java.util.List;

public class MoviesDTO {
    private List<MovieDTO> movieDTOList;

    public List<MovieDTO> getMovieDTOList() {
        return movieDTOList;
    }

    public void setMovieDTOList(List<MovieDTO> movieDTOList) {
        this.movieDTOList = movieDTOList;
    }
}
