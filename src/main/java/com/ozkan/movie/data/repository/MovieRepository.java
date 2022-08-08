/*package com.ozkan.movie.data.repository;


import com.ozkan.movie.data.entity.Movie;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Repository
public class MovieRepository implements MovieRepositoryIF {
    private static final String FIND_BY_NAME = "select * from movies where name = :name";

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public MovieRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static void fillMovies(ResultSet rs, List<Movie> movies) throws SQLException
    {
        do {
            var id = rs.getInt(1);
            var name = rs.getString(2);
            var sceneDate = rs.getDate(3).toLocalDate();
            var rating = rs.getLong(4);
            var cost = BigDecimal.valueOf(rs.getDouble(5));
            var imdb = rs.getDouble(6);
            movies.add(new Movie(id, name, sceneDate, rating, cost, imdb));

        } while (rs.next());
    }

    @Override
    public Movie findByName(String name) {
        var paramMap = new HashMap<String, Object>();

        paramMap.put("name", name);
        var movies = new ArrayList<Movie>();

        jdbcTemplate.query(FIND_BY_NAME, paramMap, (ResultSet rs) -> fillMovies(rs, movies));

        return movies.get(0);
    }

    @Override
    public Movie findByNameContains(String name) {
        return null;
    }

    @Override
    public Movie findByRating(long id) {
        return null;
    }

    @Override
    public <S extends Movie> S save(S entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends Movie> Iterable<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Movie> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Movie> findAll() {
        return null;
    }

    @Override
    public Iterable<Movie> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Movie entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Movie> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
*/

