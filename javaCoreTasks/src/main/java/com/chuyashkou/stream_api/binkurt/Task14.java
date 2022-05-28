package com.chuyashkou.stream_api.binkurt;

//14. Найдите год, когда вышло максимальное количество фильмов.

import com.chuyashkou.stream_api.binkurt.generator.MovieGenerator;
import com.chuyashkou.stream_api.binkurt.model.movie.Movie;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task14 {

    public static void main(String[] args) {

        List<Movie> movieList = MovieGenerator.getMovies();

        System.out.println(movieList.stream().collect(Collectors.groupingBy(Movie::getYear)).entrySet().stream()
                .max(Comparator.comparing(e -> e.getValue().size(), Integer::compareTo))
                .orElseThrow()
                .getKey());
    }
}
