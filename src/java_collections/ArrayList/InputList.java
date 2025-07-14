package java_collections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class InputList {

    //What is your name?
    //Enter your favorite hobby:
    //Type a city you want to visit:
    //Enter a grocery item:
    //Add a movie you like:
    //Type a book you've read recently:
    //Enter a friend's name:
    //Add a skill you want to learn:
    //Enter a programming language you know:
    //Type a song you love:

    public ArrayList userInputList(){
        Scanner scanner =new Scanner(System.in);
        ArrayList movies = new ArrayList();

        String movie;
        String skill;

        System.out.println("Enter movie names you like (type 'stop' to finish):");

        while (true) {
            System.out.print("Add a movie you like: ");
            movie = scanner.nextLine();

            if (movie.equalsIgnoreCase("stop")) {
                break;
            }

            movies.add(movie);
        }

        return movies;

    }

    public static void main(String[] args) {

        InputList obj=new InputList();
        ArrayList list=obj.userInputList();
        System.out.println("\nYour favorite movies:");
        String movies;
        for (Object movie: list) {
            System.out.println("- " + list);
        }
    }
}
