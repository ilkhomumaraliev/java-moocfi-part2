// Created by dev on 19/12/2023

// ******* Problem Instruction **********

//Write a program that reads strings from the user until
// the user inputs the string "end". As long as the input
// is not "end" the program should handle the input as an
// integer and print the cube of the integer
// (meaning number * number * number). Below are some sample outputs
//  3
//  27
//  -1
//  -1
//  11
//  1331
//  end

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter numbers");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                System.out.println("Program stopped :)");
                break;
            }

            try {
                int number = Integer.parseInt(input);
                System.out.println(calcCube(number));
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number :)");
            }
        }
    }
    public static double calcCube(int number) {
        return Math.pow(number, 3);
    }
}

