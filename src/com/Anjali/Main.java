package com.Anjali;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter your salary : ");
        Scanner input = new Scanner(System.in);
        int salary =  input.nextInt();
        if(salary>10000){
            salary = salary+2000;
        }
         else{
             salary = salary+1000;
        }
        System.out.println("your salary is " + salary); // using if-else statement
    }

}
