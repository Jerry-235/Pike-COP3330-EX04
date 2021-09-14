/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 jeremiah pike
 */

import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a quote : ");
        String quote = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter who said it : ");
        String person = input2.nextLine();

        System.out.printf(person + " says, ");
        System.out.printf('"' + quote + '"');
    }
}
