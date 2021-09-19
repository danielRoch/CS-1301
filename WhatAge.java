import java.util.Scanner;

public class WhatAge
{
    public static void main(String [] args)
    {
        Scanner Num = new Scanner(System.in);
        System.out.print("Please enter a numeric age: ");

        int age = Num.nextInt();

        if(age >= 21)
        {
            System.out.println("You are of age! Congrats!");
        }
        else
        {
            System.out.println("You not of legal age!");
        }

        Num.close();
    }
}