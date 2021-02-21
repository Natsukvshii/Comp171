//Author: Pedro DeJesus
// Date: 2/15/21
// Lab #3
// I originally completed this lab using only If...Else statements, but I wanted to learn more about
// switch statements and ternary statements so I tried my best to incorporate them in this Lab.

import java.util.Scanner;

public class Lab3PedroDeJesus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the weight of the package in pounds:");
        while(true){ //using a while loop to make testing easier.
            try { // using a try block to prevent string inputs
                double weight = Double.parseDouble(input.next()); //parsing to a double so we can handle a "NumberFormatException" exception to prevent inputting values we dont want.


                /* The syntax for Ternary Operators:
                * [BooleanExpression] ? expression1 : expression2
                * If BooleanExpression == True, do expression1, else, do expression2.
                * using this logic, I chained some Ternary operators so I could learn how they work and so we could use a switch statement instead of [if...else] statements.
                * This is probably not best practice as it may be hard to trace and
                * I imagine it might not be efficient, however I wanted to push myself and test the limits of the language along the way.
                * Curious to see how else a switch statement could have been used here. Im sure there must be a simpler solution,
                * as this would be a logical nightmare to follow if this was a code review. (Sorry Professor.)
                * */

                switch ((0 < weight && weight <= 1) ? 0 : //if true, do case 0, else, evaluate the next expression
                            (1 < weight && weight <= 4) ? 1 : //if true, do case 1, else, evaluate the next expression.
                                (4 < weight && weight <= 10) ? 2 : //if true, do case 2, else, evaluate the next expression.
                                        (10 < weight && weight <= 30) ? 3 : //if true, do case 3, else, evaluate the next expression
                                                (weight < 0) ? 4 : //if true, do case 4, else, evaluate the next expression
                                                        (weight > 30) ? 5 : 5) { //if true, do case 5, else, evaluate the next expression, which in this case, is the same as if the [BooleanExpression] is true.
                    case 0:
                        System.out.println("The cost of the shipping is US$ 3.00");
                        break;
                    case 1:
                        System.out.println("The cost of the shipping is US$ 5.00");
                        break;
                    case 2:
                        System.out.println("The cost of the shipping is US$ 10.00");
                        break;
                    case 3:
                        System.out.println("The cost of the shipping is US$ 20.00");
                        break;
                    case 4:
                        System.out.println("Invalid input. Cannot be a negative number");
                        break;
                    case 5:
                        System.out.println("The package cannot be shipped");
                }
                break; // exit the while loop
            } catch (NumberFormatException e) { //prevent the user from inputting a string
                System.out.println("Please input a real number, not a string");
            }
        }

    }

}
//Resources Used:
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html Ternary example
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html Switch documentation
// http://tutorials.jenkov.com/java/ternary-operator.html Example of Chaining Ternary Operators at bottom of the page
