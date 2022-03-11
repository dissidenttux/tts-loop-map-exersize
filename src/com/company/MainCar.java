package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MainCar {

    public static void main(String[] args) {

        /*
        2. You are a car dealer. Create a hash map of vehicles.
            - The model is the Key, the make is the Value.
            - Ask the customer what car (model) they are looking for.
              Use the Hash Map to determine if you have that vehicle, and what make it is.
            - (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
        */

        // import the Hashmap class
        HashMap<String, String> cars = new HashMap<String, String>();

        // Add keys and values (model, make)
        cars.put("Civic", "Honda");
        cars.put("Land Cruiser", "Toyota");
        cars.put("Tacoma", "Toyota");
        cars.put("Wrangler", "Jeep");
        cars.put("Mustang", "Ford");

        // while loop to execute the program until the user deliberately chooses to exit
        while (true) {
            // prompt the customer for the model they're looking for
            System.out.println("I'm your car dealer!\n" + "What model are your looking for?");
            Scanner scan = new Scanner(System.in);
            String userModelCar = scan.nextLine();

            System.out.println("A " + userModelCar + "? Let me check on that...\n");
            // empty checking String initialized
            String carKeyToBeChecked = cars.get(userModelCar);
            // Iterate over the cars HashMap
            if (carKeyToBeChecked != null) {
                System.out.println("It should be in our " + cars.get(userModelCar) + " section.\n" +
                        "Right this way!");
                System.out.println("\n");
                break;
            } else {
                System.out.println("Unfortunately, we don't have that model. Please, take a look at " +
                        "our other selections:\n");
                // show "inventory" (HashMap of cars to choose from)
                System.out.println("Inventory:\n" + cars);
                System.out.println("We'll find you one you'll love today!");

                // Prompt for the user to continue
                System.out.println("Would you like to ask for another car? (y/n)");
                String askAgain = scan.nextLine();
                // if the user chooses "n", the program will exit
                if (askAgain.equals("n")) {
                    break;
                }
                //formating for next program loop run
                System.out.println("\n");
            }
        }

    }
}
