/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

import java.util.Scanner;
import java.lang.Math;

public class ex13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        int principalAmount = input.nextInt();  //stores principal amount
        System.out.print("What is the rate? ");
        double rate = input.nextDouble();   //stores rate
        System.out.print("What is the number of years? ");
        int year = input.nextInt(); //stores years
        System.out.print("What is the number of times the interest is compounded per year? ");
        int compound = input.nextInt(); //stores compound
        double A = principalAmount*Math.pow(1+((rate*0.01)/compound),compound*year);    //calculates A
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n",principalAmount,rate,year,compound,A);
    }
}
