package com.cursor;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        for (int i = 1; i <= amount; i++) {
            String name = scanner.nextLine();
            System.out.println("Hello, " + name);
        }
        if (amount == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else if (amount < 0) {
            System.out.println("Seriously? Why so negative?");
        }
    }
}

//Write a program, asks for a number - amount of strangers to meet.
//Then reads stranger names line by line and prints line by line "Hello, ...".
