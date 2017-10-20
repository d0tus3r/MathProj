package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int getRandomNumber(){
        double randomNumber;
        randomNumber = Math.random();
        int randomInt = (int)(randomNumber * 10);
        return randomInt;
    }
/*Break this main function into a sep function that generates the question
 * public static void generateQuestion(){}
 */

    public static void main(String[] args) {
        int sumVar1 = getRandomNumber();
        int sumVar2 = getRandomNumber();
        int sum = sumVar1 + sumVar2;
        String input;
        System.out.println((Integer.toString(sumVar1)) + " + " + (Integer.toString(sumVar2)) + " = ?");
        input = scanner.nextLine();
        if((Integer.parseInt(input) == sum)){
            System.out.println("Correct! The answer was " + Integer.toString(sum));
        } else {
            System.out.println("Incorrect! The answer was " + Integer.toString(sum));
        }


    }
}
