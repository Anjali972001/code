package com.Anjali;

import java.util.Scanner;

public class revise {
    public static void main(String[] args) {
        System.out.println("Enter your salary : ");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if(salary>100000){
            salary  += 1000;
        }
        else if(salary>50000){
            salary+=500;
        }
        else{
            salary=salary+100;
        }
        System.out.println("your salary is "+ salary);
    }

}
