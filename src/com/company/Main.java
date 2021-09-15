package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int guesses = 5;
        Random random = new Random();
        int randomNum = random.nextInt(50);
        while (guesses > 0){
            Scanner input = new Scanner(System.in);
            System.out.println("Take a guess");
            int attempt = input.nextInt();
            if (attempt == randomNum){
                guesses = -1;
                System.out.println("you win!");
            }

            if (attempt < randomNum){
                guesses = guesses -1;
                System.out.println("My number is higher");
            }

            if (attempt > randomNum){
                guesses = guesses -1;
                System.out.println("My number is lower");
            }

        }
        if (guesses == 0) {
            System.out.println("You lose");
        }
    }
}
