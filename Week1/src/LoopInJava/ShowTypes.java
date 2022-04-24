package LoopInJava;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
         while (choice != 0) {
             System.out.println("Menu");
             System.out.println("1.Print the rectangle");
             System.out.println("2.Print square triangle botton-left");
             System.out.println("3.Print square triangle top-left");
             System.out.println("4.Print isosceles triangle");
             System.out.println("0.Exit");
             choice = scanner.nextInt();

             if (choice == 1){
                 System.out.println("1. Print the rectangle");
                 for (int i = 0; i < 3; i++){
                     for (int j = 0; j < 7; j++) {
                         System.out.print("*  ");
                     }
                     System.out.println("");
                 }
             }

             if (choice == 2) {
                 System.out.println("2. Print square triangle bottom-left");
                 for (int i = 1; i <=5 ; i++) {
                     for (int j = 1; j <= i; j++) {
                         System.out.print("* ");
                     }
                     System.out.println("");
                 }
             }
             if (choice == 3){
                 System.out.println("3.Print the triangle top-left");
                 for (int i = 5; i >= 1 ; i--) {
                     for (int j = 1; j <= i; j++) {
                         System.out.print("* ");
                     }
                     System.out.println("");
                 }
             }
             if(choice == 4) {
                 System.out.println("4.Print isosceles triangle");
                 for (int i = 0; i < 7; i++) {
                     for (int space = 7 - i; space >= 1; space--) {
                         System.out.print(" ");
                     }
                     for (int j = 0; j < i * 2 + 1; j++) {
                         System.out.print("*");
                     }
                     System.out.println("");
                 }
             }
             if (choice == 0){
                 System.exit(0);
             } else {
                 System.out.println("No choice");
             }

         }
    }
}
