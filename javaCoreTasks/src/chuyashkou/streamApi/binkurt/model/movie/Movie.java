package chuyashkou.streamApi.binkurt.model.movie;

import java.util.List;
import java.util.Objects;

public class Movie {

    private String title;
    private int year;
    private List<Genre> genres;
    private List<Director> directors;

    public Movie() {
    }

    public Movie(String title, int year, List<Genre> genres, List<Director> directors) {
        this.title = title;
        this.year = year;
        this.genres = genres;
        this.directors = directors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year && Objects.equals(title, movie.title) && Objects.equals(genres, movie.genres) && Objects.equals(directors, movie.directors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, genres, directors);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", genres=" + genres +
                ", directors=" + directors +
                '}';
    }
}
