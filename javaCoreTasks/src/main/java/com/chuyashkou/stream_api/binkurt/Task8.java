package com.chuyashkou.stream_api.binkurt;

//8. Сгруппируйте фильмы по годам и перечислите их:

import com.chuyashkou.stream_api.binkurt.generator.MovieGenerator;
import com.chuyashkou.stream_api.binkurt.model.movie.Movie;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task8 {

    public static void main(String[] args) {

        List<Movie> movieList = MovieGenerator.getMovies();

        movieList.stream().collect(Collectors
                .groupingBy(Movie::getYear, Collectors.mapping(Movie::getTitle, Collectors.toList()))).entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}
