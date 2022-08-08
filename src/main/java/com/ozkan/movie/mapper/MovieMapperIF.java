package com.ozkan.movie.mapper;

import com.ozkan.movie.data.entity.Director;
import com.ozkan.movie.data.entity.Movie;
import com.ozkan.movie.dto.DirectorDTO;
import com.ozkan.movie.dto.MovieDTO;
import com.ozkan.movie.dto.MoviesDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(implementationName = "MovieMapperImpl", componentModel = "spring")
public interface MovieMapperIF {
    MovieDTO toMovieDTO(Movie movie);
    List<MovieDTO> toMovieDTOList(List<Movie> movieList);
    DirectorDTO toDirectorDTO(Director director);
    List<DirectorDTO> toDirectorDTOList(List<Director> directorList);
}
