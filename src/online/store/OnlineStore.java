/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.store;

// I've imported the Scanner 
import java.util.Scanner;

/**
 *
 * @author Abas Abdi
 */
public class OnlineStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // I've declared my variables 
        double Amount = 0;
        double[] total = new double[10];
        String[] product = {"Apples" + "", "Oranges", "Mangoes", "Corn", "Peas", "Tomatoes", "Pears", "Carrots", "Watermelons", "Pineapples"};
        float[] prices = {0.50f, 0.60f, 1.25f, 0.38f, 0.64f, 0.33f, 0.40f, 1.26f, 1.12f, 1.70f};
        int[] quantity = new int[10];

        char finish = 'C';
        Scanner in = new Scanner(System.in);

        while (finish == 'C' || finish == 'c') {
            System.out.println("\nWelcome to the Online Store!\n\n A) Press A to buy " + product[0] + " (£0.50) " + "      ||    B) Press B to buy " + product[1]
                    + " (£0.60)     ||\n " + "C) Press C to buy " + product[2] + " (£1.25)      ||    D) Press D to buy " + product[3]
                    + " (£0.38)        ||\n E) Press e to buy " + product[4] + " (£0.64)         ||    F) Press F to buy " + product[5]
                    + " (£0.33)    ||\n" + " G) Press G to buy " + product[6] + " (£0.40)        ||    H) Press H to buy " + product[7]
                    + " (£1.26)     ||\n I) Press I to buy " + product[8] + " (£1.12)  ||    J) Press J to buy " + product[9] + " (£1.70)  ||\n");

            char choice = in.next().charAt(0);
            switch (choice) {
                case 'A':
                case 'a':
                    System.out.println("\nPlease choose the quantity of " + product[0] + " (£0.50) you would you like:\n");
                    quantity[0] = in.nextInt();
                    System.out.println("\nPress C to keep choosing more products or any button to end programme:\n");
                    finish = in.next().charAt(0);
                    break;
                case 'B':
                case 'b':
                    System.out.println("\nPlease choose the quantity of " + product[1] + " (£0.60) you would like:\n");
                    quantity[1] = in.nextInt();
                    System.out.println("\nPress C to keep choosing more products or any button to end programme:\n");
                    finish = in.next().charAt(0);
                    break;
                case 'C':
                case 'c':
                    System.out.println("\nPlease choose the quantity of " + product[2] + " (£1.25) you would like:\n");
                    quantity[2] = in.nextInt();
                    System.out.println("\nPress C to keep choosing more products or any button to end programme:\n");
                    finish = in.next().charAt(0);
                    break;
                case 'D':
                case 'd':
                    System.out.println("\nPlease choose the quantity of " + product[3] + " (£0.38) you would like:\n");
                    quantity[3] = in.nextInt();
                    System.out.println("\nPress C to keep choosing more products or any button to end programme:\n");
                    finish = in.next().charAt(0);
                    break;
                case 'E':
                case 'e':
                    System.out.println("\nPlease choose the quantity of " + product[4] + " (£0.64) you would like:\n");
                    quantity[4] = in.nextInt();
                    System.out.println("\nPress C to keep choosing more products or any button to end programme:\n");
                    finish = in.next().charAt(0);
                    break;
                case 'F':
                case 'f':
                    System.out.println("\nPlease choose the quantity of " + product[5] + " (£0.33) you would like:\n");
                    quantity[5] = in.nextInt();
                    System.out.println("\nPress C to keep choosing more products or any button to end programme:\n");
                    finish = in.next().charAt(0);
                    break;
                case 'G':
                case 'g':
                    System.out.println("\nPlease choose the quantity of " + product[6] + " (£0.40) you would like:\n");
                    quantity[6] = in.nextInt();
                    System.out.println("\nPress C to keep choosing more products or any button to end programme:\n");
                    finish = in.next().charAt(0);
                    break;
                case 'H':
                case 'h':
                    System.out.println("\nPlease choose the quantity of " + product[7] + " (£1.26) you would like:\n");
                    quantity[7] = in.nextInt();
                    System.out.println("\nPress C to keep choosing more products or any button to end programme:\n");
                    finish = in.next().charAt(0);
                    break;
                case 'I':
                case 'i':
                    System.out.println("\nPlease choose the quantity of " + product[8] + " (£1.12) you would like:\n");
                    quantity[8] = in.nextInt();
                    System.out.println("\nPress C to keep choosing more products or any button to end programme:\n");
                    finish = in.next().charAt(0);
                    break;
                case 'J':
                case 'j':
                    System.out.println("\nPlease choose the quantity of " + product[9] + " (£1.70) you would like:\n");
                    quantity[9] = in.nextInt();
                    System.out.println("\nPress C to keep choosing more products or any button to end programme:\n");
                    finish = in.next().charAt(0);
                    break;
                // This code executes if there is no case match
                default:

                    System.out.println("\nError: Please enter a letter from A to J!");
                    break;
            }

        }
        System.out.print("\nRECEIPT:");
        for (int i = 0; i < 10; i++) {
            total[i] = quantity[i] * prices[i];

            if (quantity[i] > 0) {
                System.out.printf("\nYou've purchased " + quantity[i] + " " + product[i] + " for = £%.2f", total[i]);
                Amount += total[i];
            }

        }
        System.out.println("\n ");
        System.out.printf("Total price: £%.2f", Amount);
        System.out.println();

    }

}
