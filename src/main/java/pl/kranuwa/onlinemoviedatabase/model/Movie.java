package pl.kranuwa.onlinemoviedatabase.model;

public class Movie {
    private String title;
    private String producer;
    private int yearOfProduction;
    private String genre;
    private String description;
    private double rating;

    public Movie(String title, String producer, int yearOfProduction, String genre, String description, double rating) {
        this.title = title;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.genre = genre;
        this.description = description;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return title +
                ", director: " + producer +
                ", year of production: " + yearOfProduction +
                ", genre: " + genre +
                ", description: " + description +
                ", rating: " + rating;
    }
}
