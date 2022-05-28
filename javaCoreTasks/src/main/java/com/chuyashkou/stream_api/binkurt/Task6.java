package com.chuyashkou.stream_api.binkurt;

//6. Найдите количество жанров фильмов каждого фильма:

import com.chuyashkou.stream_api.binkurt.generator.MovieGenerator;
import com.chuyashkou.stream_api.binkurt.model.movie.Movie;

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {

    public static void main(String[] args) {

        List<Movie> movieList = MovieGenerator.getMovies();

        movieList.stream().collect(Collectors.toMap(Movie::getTitle, movie -> movie.getGenres().size())).entrySet()
                .forEach(System.out::println);
    }
}
