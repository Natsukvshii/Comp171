//Author: Pedro DeJesus
//Date: 2/3/2021
//Lab #2
import java.util.Scanner;
public class Lab2 {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in); // creating our scanner object
	double squareFootage, costPerGallon,SqFtPerGal, materialCost, laborCost, totalCost;


	while(true){
        try{
            System.out.println("Enter the total square feet that you will be painting: ");
                squareFootage = Double.parseDouble(input.next());
            System.out.println("Enter the cost of one gallon can of paint: ");
                costPerGallon = Double.parseDouble(input.next());
            System.out.println("Enter how many square feet you can paint with one gallon can of paint: ");
                SqFtPerGal = Double.parseDouble(input.next());

            materialCost = (squareFootage/SqFtPerGal) * costPerGallon;
            laborCost = materialCost * .3;
            totalCost = ((int)(laborCost * 100)/100.0) + ((int)(materialCost * 100)/100.0);

            System.out.println("Your quote for the painting job of area " + (int)(squareFootage * 100)/100.0 + " is US$ " + (int)(materialCost * 100)/100.0 + " for material and US$ " + (int)(laborCost * 100)/100.0 +" for labor, for a total of US$ " + totalCost);
            break;
        }
	    catch(NumberFormatException e){
            System.out.println("Please input a valid number.");
        }

    }

    }
}
//Resources used:
//Just the same loop logic from the while loop I used in Lab #1.
