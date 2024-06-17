package com.techlabs.test;
import java.io.*;
import java.util.Scanner;

import com.techlabs.model.CapacityFullException;
import com.techlabs.model.Movie;
import com.techlabs.model.NoSuchMovieFoundException;

public class SimpleMoviesApp {
    private static final int MAX_CAPACITY = 5;
    private Movie[] movies;
    private int movieCount;
    private String filepath;

    public SimpleMoviesApp(String filepath) {
        this.movies = new Movie[MAX_CAPACITY];
        this.movieCount = 0;
        this.filepath = filepath;
        loadMovies();
    }

    private void loadMovies() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath))) {
            movies = (Movie[]) ois.readObject();
            movieCount = movies.length;
        } catch (FileNotFoundException | EOFException e) {
            movies = new Movie[MAX_CAPACITY];
            movieCount = 0;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void saveMovies() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath))) {
            oos.writeObject(movies);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addMovie(Movie movie) throws CapacityFullException {
        if (movieCount >= MAX_CAPACITY) {
            throw new CapacityFullException("Cannot add more than 5 movies.");
        }
        movies[movieCount++] = movie;
        saveMovies();
    }

    public void displayMovies() throws NoSuchMovieFoundException {
        if (movieCount == 0) {
            throw new NoSuchMovieFoundException("No movies found.");
        }
        for (int i = 0; i < movieCount; i++) {
            System.out.println(movies[i]);
        }
    }

    public Movie searchMovieById(String id) throws NoSuchMovieFoundException {
        for (int i = 0; i < movieCount; i++) {
            if (movies[i].getId().equals(id)) {
                return movies[i];
            }
        }
        throw new NoSuchMovieFoundException("Movie with ID " + id + " not found.");
    }

    public static void main(String[] args) {
        SimpleMoviesApp app = new SimpleMoviesApp("movies.dat");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSimpleMoviesApp Menu:");
            System.out.println("1. Display movies");
            System.out.println("2. Add movie");
            System.out.println("3. Search movie by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline

            switch (choice) {
                case 1:
                    try {
                        app.displayMovies();
                    } catch (NoSuchMovieFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Enter movie ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Enter movie name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter movie genre: ");
                        String genre = scanner.nextLine();
                        System.out.print("Enter movie year: ");
                        int year = scanner.nextInt();
                        scanner.nextLine();  // consume the newline

                        Movie movie = new Movie(id, name, genre, year);
                        app.addMovie(movie);
                        System.out.println("Movie added successfully!");
                    } catch (CapacityFullException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter movie ID to search: ");
                    String id = scanner.nextLine();
                    try {
                        Movie movie = app.searchMovieById(id);
                        System.out.println("Movie found: " + movie);
                    } catch (NoSuchMovieFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Exiting the application...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
