package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = 0, b = 0;
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Enter two numbers: ");
            System.out.println("Enter a number: ");
            try {
                a = Double.parseDouble(reader.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
                continue;
            } finally {
                System.out.println("Done");
            }
            System.out.println("Enter b number: ");
            try {
                b = Double.parseDouble(reader.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
                continue;
            } finally {
                System.out.println("Done");
            }
            System.out.println("Enter an operator (+, -, *, /): ");
            String operator = reader.nextLine();
            switch (operator) {
                case "+":
                    System.out.println(Calculator.addition(a, b));
                    break;
                case "-":
                    System.out.println(Calculator.subtract(a, b));
                    break;
                case "*":
                    System.out.println(Calculator.multiply(a, b));
                    break;
                case "/":
                    System.out.println(Calculator.divide(a, b));
                    break;
                default:
                    System.out.println("Invalid operator");
            }
            System.out.println("Do you want to continue? (y/n)");
            if (!reader.nextLine().equals("y")) {
                break;
            }
        }
    }
}