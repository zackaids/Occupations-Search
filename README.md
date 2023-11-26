# Occupations-Search

A program based in Java, which uses the data sourced of the information about empoyment in specific occupations in the United States, from the US Department of Labor in May of 2018 (https://www.bls.gov/news.release/archives/ocwage_03292019.pdf) and creates a terminal interface to create a menu that asks for the user input of numbers 1-5. Each number corresponding to a specific method that is called: 

1. Prints the Occupations List
2. Prints the total number of people employed across all occupations
3. Prints the average of all average salaries between occupations
4. Searches for the data for a specific occupation using the unique COS code
5. Exits the program

The program contains three separate java classes: Main, OccupationList, and Occupation.

The **Main** class is the executable class for the project, which first calls the method to read the data from the file, then creates an input display, using a while loop with if conditions to determine the input.

The **OccupationList** class is a class which contains the methods to manipulate the data, such as the method to read data, print the data, calculates the total employed, calculates the average salary, and searches through the data to find the occupation that corresponds to the input.

The **Occupation** class is the main class that contains the methods to manipulate properties of an Occupation object, such as getting the COS code, and setting the COS code. It also includes a method that will return a string with a line of information about the occupation.
