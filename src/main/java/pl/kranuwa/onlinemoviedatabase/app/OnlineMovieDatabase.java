package pl.kranuwa.onlinemoviedatabase.app;

import pl.kranuwa.onlinemoviedatabase.io.ConsoleDataReader;
import pl.kranuwa.onlinemoviedatabase.model.Actor;
import pl.kranuwa.onlinemoviedatabase.model.Movie;
import pl.kranuwa.onlinemoviedatabase.model.Series;

public class OnlineMovieDatabase {

    private static final String APP_NAME = "OnlineMovieDatabase v0.2";

    public static void main(String[] args) {
        System.out.println(APP_NAME);
        ConsoleDataReader dataReader = new ConsoleDataReader();
        Actor actor = dataReader.createActor();
        Movie movie = dataReader.createMovie();
        Series series = dataReader.createSeries();
        System.out.println(actor);
        System.out.println(movie);
        System.out.println(series);
    }
}
