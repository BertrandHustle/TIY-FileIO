import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //init

        File items = new File("items.json");

        try {

            FileWriter filewriter = new FileWriter(items, true);

            //Print contents of file (gonna need to deserialize here)

            Scanner reader = new Scanner(items);
            Gson gson = new GsonBuilder().create();

            if (items.length() != 0) {

                reader.useDelimiter("\\Z");
                String list = reader.next();

                Game gamePrint = gson.fromJson(list, Game.class);

                System.out.println(gamePrint);

                String json = gson.toJson("");

                FileWriter fileOverwriter = new FileWriter(items);

                fileOverwriter.write(json);

            }


             //init for object creation

                String title;
                String genre;
                int year;
                String system;
                boolean completed;

                Scanner scanner = new Scanner(System.in);

                //Asks for user input and writes into JSON file

                System.out.println("Welcome to GamesLibrary 1.0!");

                System.out.println("Title?");
                title = scanner.nextLine();

                System.out.println("Genre?");
                genre = scanner.nextLine();

                System.out.println("Year?");

                //needs "friendly" exception handler

                year = Integer.parseInt(scanner.nextLine());

                System.out.println("System?");
                system = scanner.nextLine();

                System.out.println("Completed?");
                if (scanner.nextLine().equals("yes")) {
                    completed = true;
                } else {
                    completed = false;
                }

                Game game = new Game(title, genre, year, system, completed);

                String json = gson.toJson(game);
                filewriter.write(json);
                filewriter.close();

            } catch (IOException ioexception) {
                System.out.println("Error! Please try again!");
            }

            catch (NumberFormatException nfe) {
                System.out.println("enter a number please!");
            }
    }
}
