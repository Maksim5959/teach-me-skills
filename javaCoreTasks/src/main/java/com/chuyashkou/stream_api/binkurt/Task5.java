package com.chuyashkou.stream_api.binkurt;

//5. Найдите количество фильмов каждого режиссера.

import com.chuyashkou.stream_api.binkurt.generator.MovieGenerator;
import com.chuyashkou.stream_api.binkurt.model.movie.Director;
import com.chuyashkou.stream_api.binkurt.model.movie.Movie;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {

    public static void main(String[] args) {

        List<Movie> movieList = MovieGenerator.getMovies();

        movieList.stream().flatMap(movie -> movie.getDirectors().stream())
                .collect(Collectors.groupingBy(Director::getName, Collectors.counting())).entrySet()
                .forEach(System.out::println);
    }
}
