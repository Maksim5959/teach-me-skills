package chuyashkou.streamApi.binkurt;

//5. Найдите количество фильмов каждого режиссера.

import chuyashkou.streamApi.binkurt.generator.MovieGenerator;
import chuyashkou.streamApi.binkurt.model.movie.Director;
import chuyashkou.streamApi.binkurt.model.movie.Movie;

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
