package pl.kranuwa.onlinemoviedatabase.model;

public class Series {
    private String title;
    private int seasons;
    private int episodes;
    private String producer;
    private String genre;
    private String description;
    private double rating;

    public Series(String title, int seasons, int episodes, String producer, String genre, String description, double rating) {
        this.title = title;
        this.seasons = seasons;
        this.episodes = episodes;
        this.producer = producer;
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

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
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
                ", number of seasons: " + seasons +
                ", number of episodes: " + episodes +
                ", director: " + producer +
                ", genre: " + genre +
                ", description: " + description +
                ", rating: " + rating;
    }
}
