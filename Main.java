package com.company; // <-- I used intelliJ as my IDE and I'm still learning how to properly use it.
// Im more familiar with PyCharm IDE from the same company and I really like their IDE's so I'm trying out intelliJ, but for some reason intelliJ keeps creating a package
// and yells at me when I try to remove it so if for whatever reason my code doesnt run on your machine,
// deleting this should fix it. I should have this fixed by Lab #3.


//Author: Pedro DeJesus
//Date: 2/2/2021
//Lab 1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create the scanner object
        double userInput = 0; // initialize userInput to 0 outside of the while loop so I can store the input in it later

        while(true){ //while loop so we can do some error handling and prevent a user from inputting invalid data types :)

            System.out.println("Input a number in Sterling Pounds: "); //ask the user to input a number

            //take the scanner input as a string using input.next(); and try to parse it as a double using Double.parseDouble();, if it fails, exit and tell the user the input is invalid.
            try{

                userInput = Double.parseDouble(input.next()); //Built in Java method that tries to convert input.next() (a string) to a double, will throw a NumberFormatException if the string doesnt contain a parsable float (You cant parse alphabetical characters as doubles). Saves it into user input if all goes well.


                double newTotal = userInput * 1.37; //math to convert Pounds to USD.


                System.out.println( (int)(userInput * 100)/100.0 + " Sterling Pounds is equivalent to " + (int)(newTotal*100)/100.0 + " American Dollars"); //Print statement that truncates userInput and newTotal to two decimal places.


                break; //exits the loop
            } catch(NumberFormatException e){ // if we get a NumberFormatException, we print out that its an invalid output, and we run the while loop again until the user decides to provide a valid input :)
                System.out.println("Invalid input, please enter a valid number. Eg: 16.76, 180, etc.");
            }
        }

    }
}

//Resources Used: (I hope this is allowed, if not, I apologize and will refrain from doing it again.)
// https://docs.oracle.com/javase/tutorial/essential/exceptions/try.html
// https://stackoverflow.com/questions/22644397/using-try-catch-java
// https://stackoverflow.com/questions/9781373/a-try-catch-method-in-while-loop (Specifically the second answer as I was looking for syntax)
// https://docs.oracle.com/javase/7/docs/api/java/lang/Double.html#parseDouble(java.lang.String) (for Double.ParseDouble(); method.)
