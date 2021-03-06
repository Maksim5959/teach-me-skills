package com.chuyashkou.stream_api.binkurt;

// 8. Найдите список фильмов только в жанрах «Драма» и «Комедия»:

import com.chuyashkou.stream_api.binkurt.generator.MovieGenerator;
import com.chuyashkou.stream_api.binkurt.model.movie.Genre;
import com.chuyashkou.stream_api.binkurt.model.movie.Movie;

import java.util.List;
import java.util.stream.Collectors;

public class Task7 {

    public static void main(String[] args) {

        List<Movie> movieList = MovieGenerator.getMovies();

        movieList.stream().filter(movie -> movie.getGenres().stream()
                .allMatch(genre -> genre.equals(Genre.COMEDY) || genre.equals(Genre.DRAMA)))
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
