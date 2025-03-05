public class Movie {
    String title;
    double movieLengthInMinutes;
    String rating;
    String director;

    public Movie(String title, double movieLengthInMinutes, String rating, String director) {
        this.title = title;
        this.movieLengthInMinutes = movieLengthInMinutes;
        this.rating = rating;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getMovieLengthInMinutes() {
        return movieLengthInMinutes;
    }

    public void setMovieLengthInMinutes(double movieLengthInMinutes) {
        this.movieLengthInMinutes = movieLengthInMinutes;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
