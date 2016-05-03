import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{

        //init
        Scanner scanner = new Scanner(System.in);
        File items = new File("items.json");

        FileWriter filewriter = new FileWriter(items, true);

            //try {

                //Print contents of file (gonna need to deserialize here)

                Scanner reader = new Scanner(items);

                if (items.length() != 0) {

                    Gson gson = new GsonBuilder().create();

                    reader.useDelimiter("\\Z");
                    String list = reader.next();

                    Game gamePrint = gson.fromJson(list, Game.class);

                    System.out.println(gamePrint);

                    items.delete();

                }

                 //init for object creation

                    String title;
                    String genre;
                    int year;
                    String system;
                    boolean completed;



                    //Asks for user input and writes into JSON file

                    System.out.println("Welcome to GamesLibrary 1.0!");

                    System.out.println("Title?");

                    title = scanner.next();

                    System.out.println("Genre?");

                    genre = scanner.next();

                    System.out.println("Year?");

                    year = Integer.parseInt(scanner.next());

                    System.out.println("System?");

                    system = scanner.next();

                    System.out.println("Completed?");

                    if (scanner.next().equals("yes")) {

                        completed = true;

                    } else {

                        completed = false;

                    }

                    Game game = new Game(title, genre, year, system, completed);

                    Gson gson = new GsonBuilder().create();
                    String json = gson.toJson(game);

                    filewriter.write(json);

                    filewriter.close();

            //} catch (IOException ioexception) {

              //  System.out.println("Error! Please try again!");


//            }


    }
}
