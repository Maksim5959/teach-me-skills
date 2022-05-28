package com.chuyashkou.stream_api.binkurt.generator;

import com.chuyashkou.stream_api.binkurt.model.movie.Director;
import com.chuyashkou.stream_api.binkurt.model.movie.Genre;
import com.chuyashkou.stream_api.binkurt.model.movie.Movie;

import java.util.Arrays;
import java.util.List;

public class MovieGenerator {

    public static List<Movie> getMovies() {
        Movie movie1 = new Movie("Gray's Anatomy", 2010, Arrays.asList(Genre.COMEDY, Genre.DRAMA)
                , Arrays.asList(new Director("Rob Corn"), new Director("Stieven Karegg")));
        Movie movie2 = new Movie("Cinderella", 2013, Arrays.asList(Genre.FANTASY, Genre.DRAMA),
                Arrays.asList(new Director("Kenet Brana")));
        Movie movie3 = new Movie("Dallas buyers club", 2013, Arrays.asList(Genre.DRAMA, Genre.COMEDY, Genre.MELODRAMA),
                Arrays.asList(new Director("Jan-Mark Valle")));
        Movie movie4 = new Movie("Maleficent", 2014, Arrays.asList(Genre.FANTASY, Genre.HORROR),
                Arrays.asList(new Director("Robert Stronberg")));
        Movie movie5 = new Movie("Beauty and the beast", 2017, Arrays.asList(Genre.FANTASY, Genre.DETECTIVE),
                Arrays.asList(new Director("Bill Condon"), new Director("Robert Stronberg")));
        return Arrays.asList(movie1, movie2, movie3, movie4, movie5);
    }
}
