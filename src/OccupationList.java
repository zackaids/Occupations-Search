/*
* OccupationList.java
* Class for a list of occupations as an array.
* This class contains the methods to manipulate the array of occupations, reads data
* into the array form file, allow the user to search the array, and print the array.
* Now contains a method to calculate the total number of employees
* and a method that calculates the average of all salaries.
* last edited 6 2 23 by Zack A
*/

import java.util.*;
import java.io.*;

// This class defines the OccupationList object that contains an array of Occupation objects and methods to work with them
public class OccupationList {
    // An array of 1000 Occupation objects
    Occupation[] occu = new Occupation[1000];
    // A variable to store the number of Occupation objects
    int size = 0;

    // A method that reads data from the "occupations.txt" file and populates the `occu` array with Occupation objects
    public void readData() throws Exception {
        int i = 0;

        // Variables to store the values read from the file
        String inCos;
        String inTitle;
        int inEmployed;
        int inSalary;

        // Create a File object for the "occupations.txt" file
        File occuFile = new File("occupations.txt");
        // Create a Scanner object to read data from the file
        Scanner infile = new Scanner(occuFile);

        // Read data from the file while it has data
        while (infile.hasNext()) {
            // Read the values for each Occupation object
            inCos = infile.nextLine();
            inTitle = infile.nextLine();
            inEmployed = Integer.parseInt(infile.nextLine().replace(",", ""));
            inSalary = Integer.parseInt(infile.nextLine().replace(",", ""));

            // Create a new Occupation object with the read data and add it to the `occu` array
            occu[i] = new Occupation(inCos, inTitle, inEmployed, inSalary);
            i++;
        }
        // Close the Scanner object
        infile.close();
        // Update the `size` variable with the number of Occupation objects
        size = i;
    }

    // A method that prints the contents of the `occu` array in a formatted manner
    public void printData() {
        // Print the header
        System.out.println("The List of all occupations: \n");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("COS     | Title                                                                                                               | # employed | salary      |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
        // Loop through the `occu` array and print the contents of each Occupation object
        for (int i = 0; i < size; i++) {
            System.out.printf("%-5s | %-115s | %-10d | $%-10d |\n", occu[i].getCos(), occu[i].getTitle(), occu[i].getEmployed(), occu[i].getSalary());
        }
        // Print the footer
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------");
    } // end void printData()

    // A method that takes a string `inputCos` and returns the Occupation information,
    // if not, it returns an error message and asks for another input
    public Occupation identifyData(String inputCos) {
        Occupation foundOccupation = null; // variable to store the found occupation object
        boolean found = false; // variable to check if the occupation has been found

        // loop until the occupation is found
        for (int i = 0; i < size && !found; i++) {
            String tempCos = occu[i].getCos(); // get the occupation name
            // check if the input occupation name matches the current occupation name
            if (tempCos.equals(inputCos)) {
                System.out.print(occu[i]); // print the found occupation
                foundOccupation = occu[i]; // store the found occupation
                found = true;
            }
        }
        if (!found) {
            System.out.println("Occupation not found. Please try again.");
        }
        return foundOccupation;
    } // end identifyData()
    public int calculateTotalEmployed() {
        int totalEmployed = 0;

        // Loop through the `occu` array and sum up the number of employed people in each Occupation object
        for (int i = 0; i < size; i++) {
            totalEmployed += occu[i].getEmployed();
        }
        System.out.println("\nThe total population of people employed is "+totalEmployed);
        return totalEmployed;
    }
    public int calculateAverageSalary() {
        int averageSalary = 0;
        int totalSalary = 0;

        for (int i = 0; i< size; i++) {
            totalSalary += occu[i].getSalary();
        }
        averageSalary = totalSalary / size;

        System.out.println("\nThe average salary of all the occupations is $"+averageSalary);
        return averageSalary;
    }
} // end class OccupationList()
