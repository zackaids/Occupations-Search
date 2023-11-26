/*
* Main.java
* The main executable class for the project. The class contains the main() method,
* first calls a method to read the data from the file, then has a menu
* to ask the user for an input of what action they'd like.
* last edited 6 2 23 by Zack A
*/

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // Create an instance of the OccupationList class
        OccupationList myList = new OccupationList();

        // Read the data
        myList.readData();

        // Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Menu loop
        boolean exit = false;
        while (!exit) {
            // Display the menu options
            System.out.println("\nMenu:");
            System.out.println("1. Print the entire list");
            System.out.println("2. Print the total number of people employed across all occupations");
            System.out.println("3. Print the average of all average salaries");
            System.out.println("4. Search for the data for one occupation by its COS code");
            System.out.println("5. Exit");

            // Get user choice
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // Perform the corresponding action based on the user's choice
            if (choice == 1) {
                // Print the entire list
                myList.printData();
            } // end if
            else if (choice == 2) {
                // Print the total number of people employed across all occupations
                myList.calculateTotalEmployed();
            } // end else if
            else if (choice == 3) {
                // Print the average of all average salaries
                myList.calculateAverageSalary();
            } // end else if
            else if (choice == 4) {
                // Search for the data for one occupation by its COS code
                System.out.print("Enter the COS code: ");
                String inputCos = scanner.next();
                myList.identifyData(inputCos);
            } // end else if
            else if (choice == 5) {
                // Exit the program
                exit = true;
            } // end else if
            else {
                System.out.println("Invalid choice. Please try again.");
            } // end else
        } // end while()

        // Close the scanner
        scanner.close();
    } // end public static void main(String[] args)
} // end public class Main