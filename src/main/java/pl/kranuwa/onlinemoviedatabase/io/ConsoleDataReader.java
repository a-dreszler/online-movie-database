package pl.kranuwa.onlinemoviedatabase.io;

import pl.kranuwa.onlinemoviedatabase.model.Actor;
import pl.kranuwa.onlinemoviedatabase.model.Movie;
import pl.kranuwa.onlinemoviedatabase.model.Series;

import java.util.Locale;
import java.util.Scanner;

public class ConsoleDataReader {

    private static final Scanner INPUT = new Scanner(System.in);
    private static final int MIN_YEAR_OF_PROD = 1888;

    public ConsoleDataReader() {
        INPUT.useLocale(Locale.US);
    }

    public Movie createMovie() {
        System.out.println("Title:");
        String title = INPUT.nextLine();
        System.out.println("Producer:");
        String producer = INPUT.nextLine();
        System.out.println("Year of production:");
        int yearOfProduction = readInt();
        if (yearOfProduction < MIN_YEAR_OF_PROD) {
            return null;
        }
        System.out.println("Genre:");
        String genre = INPUT.nextLine();
        System.out.println("Description:");
        String description = INPUT.nextLine();
        System.out.println("Rating: ");
        double rating = readDouble();
        if (rating < 0 || rating > 10) {
            return null;
        }

        return new Movie(title, producer, yearOfProduction, genre, description, rating);
    }

    public Actor createActor() {
        System.out.println("First name:");
        String firstName = INPUT.nextLine();
        System.out.println("Last name:");
        String lastName = INPUT.nextLine();
        System.out.println("Country:");
        String country = INPUT.nextLine();

        return new Actor(firstName, lastName, country);
    }

    public Series createSeries() {
        System.out.println("Title:");
        String title = INPUT.nextLine();
        System.out.println("Number of seasons:");
        int seasons = readInt();
        if (seasons < 0) {
            return null;
        }
        System.out.println("Number of episodes:");
        int episodes = readInt();
        if (episodes < 0 || episodes < seasons) {
            return null;
        }
        System.out.println("Producer:");
        String producer = INPUT.nextLine();
        System.out.println("Genre:");
        String genre = INPUT.nextLine();
        System.out.println("Description:");
        String description = INPUT.nextLine();
        System.out.println("Rating: ");
        double rating = readDouble();
        if (rating < 0 || rating > 10) {
            return null;
        }

        return new Series(title, seasons, episodes, producer, genre, description, rating);
    }

    private int readInt() {
        int intToRead = INPUT.nextInt();
        INPUT.nextLine();
        return intToRead;
    }

    private double readDouble() {
        double doubleToRead = INPUT.nextDouble();
        INPUT.nextLine();
        return doubleToRead;
    }
}
