package pl.kranuwa.onlinemoviedatabase.model;

public class Movie {
    private String name;
    private String producer;
    private int yearOfProduction;
    private String genre;
    private String description;
    private double rating;

    public Movie(String name, String producer, int yearOfProduction, String genre, String description, double rating) {
        this.name = name;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.genre = genre;
        this.description = description;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return name + ", reżyser: " + producer + ", rok produkcji: " + yearOfProduction + ", gatunek: " + genre +
                ", opis: " + description + ", ocena: " + rating;
    }
}
