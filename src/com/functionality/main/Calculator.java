package com.functionality.main;

import java.util.Scanner;

import com.implementation.AdditionImpl;
import com.implementation.AverageImpl;
import com.implementation.CubeImpl;
import com.implementation.DivisionImpl;
import com.implementation.EvenOddImpl;
import com.implementation.FactorsImpl;
import com.implementation.ModulusImpl;
import com.implementation.MultiplicationImpl;
import com.implementation.SquareImpl;
import com.implementation.SubstractionImpl;



public class Calculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        // Creating instances of operation classes
	        AdditionImpl add = new AdditionImpl();
	        SubstractionImpl sub = new SubstractionImpl();
	        MultiplicationImpl mul = new MultiplicationImpl();
	        DivisionImpl div = new DivisionImpl();
	        ModulusImpl mod = new ModulusImpl();
	        SquareImpl sq = new SquareImpl();
	        CubeImpl cube = new CubeImpl();
	        AverageImpl avg = new AverageImpl();
	        FactorsImpl factors = new FactorsImpl();
	        EvenOddImpl evenOdd = new EvenOddImpl();

	        System.out.println("Welcome to console based application");
	        
	        while (true) {
	            System.out.println("Select an operation:");
	            System.out.println(" 1:Addition of two numbers");
	            System.out.println(" 2:Subtraction of two numbers");
	            System.out.println(" 3:Multiplication of two numbers");
	            System.out.println(" 4:Division of two numbers");
	            System.out.println(" 5:Modulus of two numbers");
	            System.out.println(" 6:Square of a number");
	            System.out.println(" 7:Cube of a number");
	            System.out.println(" 8:Average of numbers");
	            System.out.println(" 9:Factors of a number");
	            System.out.println(" 10:Check if number is even or odd");
	            System.out.println("Enter your choice :");
	            choice = scanner.nextInt();

	            int num1, num2;
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the first number: ");
	                    num1 = scanner.nextInt();
	                    System.out.print("Enter the second number: ");
	                    num2 = scanner.nextInt();
	                    System.out.println("Addition is: " + add.add(num1, num2));
	                    break;

	                case 2:
	                    System.out.print("Enter the first number: ");
	                    num1 = scanner.nextInt();
	                    System.out.print("Enter the second number: ");
	                    num2 = scanner.nextInt();
	                    System.out.println("Subtraction is: " + sub.substract(num1, num2));
	                    break;

	                case 3:
	                    System.out.print("Enter the first number: ");
	                    num1 = scanner.nextInt();
	                    System.out.print("Enter the second number: ");
	                    num2 = scanner.nextInt();
	                    System.out.println("Multiplication is: " + mul.mul(num1, num2));
	                    break;

	                case 4:
	                    System.out.print("Enter the first number: ");
	                    num1 = scanner.nextInt();
	                    System.out.print("Enter the second number: ");
	                    num2 = scanner.nextInt();
	                    try {
	                        System.out.println("Division is: " + div.div(num1, num2));
	                    } catch (ArithmeticException e) {
	                        System.out.println(e.getMessage());
	                    }
	                    break;

	                case 5:
	                    System.out.print("Enter the first number: ");
	                    num1 = scanner.nextInt();
	                    System.out.print("Enter the second number: ");
	                    num2 = scanner.nextInt();
	                    System.out.println("Modulus is: " + mod.modulus(num1, num2));
	                    break;

	                case 6:
	                    System.out.print("Enter any number: ");
	                    num1 = scanner.nextInt();
	                    System.out.println("Square is: " + sq.square(num1));
	                    break;

	                case 7:
	                    System.out.print("Enter any number: ");
	                    num1 = scanner.nextInt();
	                    System.out.println("Cube is: " + cube.cube(num1));
	                    break;

	                case 8:
	                	 System.out.println("Enter 10 numbers for average calculation: ");
	                     int[] numbers = new int[5];
	                     int sum = 0;
	                     for (int i = 0; i < 10; i++) {
	                         numbers[i] = scanner.nextInt();
	                         sum += numbers[i];
	                     }
	                     System.out.println("Average: " + (sum / 10));
	                     break;
	                case 9:
	                    System.out.print("Enter any number: ");
	                    num1 = scanner.nextInt();
	                    factors.getFactors(num1);
	                    break;

	                case 10:
	                	System.out.print("Enter a number to check even or odd: ");
	                    num1 = scanner.nextInt();
	                    if (num1 % 2 == 0) {
	                        System.out.println(num1 + " is an even number.");
	                    } else {
	                        System.out.println(num1 + " is an odd number.");
	                    }
	                    break;

	                default:
	                    System.out.println("Entered information is wrong");
	            }
	            if (choice == 0) {
	                break;
	            }
	        }

	        scanner.close();
	    }
	}