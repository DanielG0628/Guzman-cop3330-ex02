package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables and scanner
        String userName;
        Scanner sc = new Scanner(System.in);

        //Prompt user and scan user input
        System.out.println("What is the input string?");
        userName = sc.next();

        //output
        System.out.println(userName + " has " + userName.length() + " characters.");

        //closer scanner
        sc.close();
    }
}