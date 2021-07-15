package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    // Write a program that implement the following formula
        // using recursion.
        // nCr = n!/(n-r)!r!
        //Factorial: 4! = 4 x 3 x 2 x 1 = 24
        //create a method called factorial, to find the factorial of a number
        // entered as a parameter.
        // return the value

        // Recursion is a concept where a method calls itself
        // There's usually a base cae or condition.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter N: ");
//        double n = scanner.nextDouble();
//        System.out.println("Enter R: ");
//        double r = scanner.nextDouble();
//        double nCr = factorial(n) / (factorial(r) * factorial(n -r));
//        System.out.println("nCr is: " + nCr);
//
//
//    }
//    public static double factorial(double number) {
//        if(number == 0 || number == 1) {
//            return 1;
//        } else{
//            return number * factorial(number - 1);

        //Initialize Scanner

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the value of n: ");
//        float n = scanner.nextFloat();
//
//        System.out.println("Enter the value of r: "); // 24
//        float r = scanner.nextFloat();
//        float nCr = factorial(n) / (factorial(n-r) * factorial(r));
//        System.out.println("Result = " + nCr);
//
//
//
//    }
//    public static float factorial(float number) {
//        if(number == 0 || number == 1) {
//            return 1;
//        } else{
//            return number * factorial(number - 1);
//            // 4 * factorial (4 - 1)
//            // 3 * factorial (3 - 1)
//            // 2 * factorial (2 - 1)
//        }

        // Create a class called Person. They should have:// The person class will be the parent class
        // - name, age.
        // Create a class called Employee. This class should inherit // The employee class will be the child class
        // the Person class. and should have the extra field of
        // - company id, company name.
        // Create a company class called Company. This class should take in employee as
        // an array attribute, name.
        //
        // In your main method, populate a company's employees attribute and
        // find the average age of the employees.

        Employee[] javaEmployees = {
                new Employee("George",35,"J12","Microsoft"),
                new Employee("Dana", 29, "H19", "Microsoft"),
                new Employee("Harry", 28, "U23", "Microsoft")
        };
        Employee[] javascriptEmployee = {
                new Employee("Nathan",31, "I91", "Google"),
                new Employee("Jane",42, "A22", "Google"),
                new Employee("Jordan",22, "o23", "Google"),
        };

        Company microsoft = new Company("Microsoft", javaEmployees);
        Company google = new Company("Google", javascriptEmployee);

//        System.out.println(" The average age of Microsoft employees is " + microsoft.getAverage());
//        System.out.println(" The average age of Google employees is " + google.getAverage());

        System.out.println(google.getEmployee().getName());

    }

}
