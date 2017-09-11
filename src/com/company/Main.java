package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int number = 0;
        String numberString;

        Scanner scanner = new Scanner(System.in);

            System.out.println("Ice-cream flavors:");
            System.out.println("1. Strawberry ");
            System.out.println("2. Chocolate ");
            System.out.println("3. Vanilla");
            System.out.println("4. Coconut ");
            System.out.println("5. Pistachio");

        while (number <6) {

            System.out.println("\nSelect your ice-cream flavor: ");
            number = scanner.nextInt();

            switch (number) {
                case 1:
                    numberString = "You have selected Strawberry flavor!";
                    break;
                case 2:
                    numberString = "You have selected Chocolate flavor!";
                    break;
                case 3:
                    numberString = "You have selected Vanilla flavor!";
                    break;
                case 4:
                    numberString = "You have selected Coconut flavor!";
                    break;
                case 5:
                    numberString = "You have selected Pistachio flavor!";
                    break;
                default:
                    numberString = "Invalid entry.";
            }
            System.out.println(numberString);

        }


    }
}
