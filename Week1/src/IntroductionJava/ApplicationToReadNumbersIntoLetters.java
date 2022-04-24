package IntroductionJava;

import java.util.Scanner;

public class ApplicationToReadNumbersIntoLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number = scanner.nextInt();

        if (number > 0 && number < 10){
            switch (number){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
        if (number >= 10 && number < 20){
            switch (number){
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventing");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
            }
        }
        if (number >= 20 && number < 100){
            int dozens = number / 10;
            switch (dozens)  {
                case 2:
                    System.out.print("Twenty");
                    break;
                case 3:
                    System.out.print("Thirty");
                    break;
                case 4:
                    System.out.print("Fourty");
                    break;
                case 5:
                    System.out.print("Fifty");
                    break;
                case 6:
                    System.out.print("Sixty");
                    break;
                case 7:
                    System.out.print("Seventy");
                    break;
                case 8:
                    System.out.print("Eightty");
                    break;
                case 9:
                    System.out.print("Ninety");
                    break;
            }
            int unit = number % 10;
            switch (unit){
                case 1:
                    System.out.println(" One");
                    break;
                case 2:
                    System.out.println(" Two");
                    break;
                case 3:
                    System.out.println(" Three");
                    break;
                case 4:
                    System.out.println(" Four");
                    break;
                case 5:
                    System.out.println(" Five");
                    break;
                case 6:
                    System.out.println(" Six");
                    break;
                case 7:
                    System.out.println(" Seven");
                    break;
                case 8:
                    System.out.println(" Eight");
                    break;
                case 9:
                    System.out.println(" Nine");
                    break;
            }
            System.out.print("Number convert: " + dozens + unit);
        } else if (number >= 100 && number < 1000){
            int hundreds = number / 100;
            switch (hundreds) {
                case 1:
                    System.out.print("One hunderes");
                    break;
                case 2:
                    System.out.print("Two hunderes");
                    break;
                case 3:
                    System.out.print("Three hunderes");
                    break;
                case 4:
                    System.out.print("Four hunderes");
                    break;
                case 5:
                    System.out.print("Five hunderes");
                    break;
                case 6:
                    System.out.print("Six hunderes");
                    break;
                case 7:
                    System.out.print("Seven hunderes");
                    break;
                case 8:
                    System.out.print("Eight hunderes");
                    break;
                case 9:
                    System.out.print("Nine hunderes");
                    break;
            }
            int dozens = (number % 100) / 10;
            switch (dozens) {
                case 2:
                    System.out.print(" Twenty");
                    break;
                case 3:
                    System.out.print(" Thirty");
                    break;
                case 4:
                    System.out.print(" Fourty");
                    break;
                case 5:
                    System.out.print(" Fifty");
                    break;
                case 6:
                    System.out.print(" Sixty");
                    break;
                case 7:
                    System.out.print(" Seventy");
                    break;
                case 8:
                    System.out.print(" Eighty");
                    break;
                case 9:
                    System.out.print(" Ninety");
                    break;
            }
            int unit = (number % 100) % 10;
            switch (unit){
                case 1:
                    System.out.print(" One \n");
                    break;
                case 2:
                    System.out.print(" Two\n");
                    break;
                case 3:
                    System.out.println(" Three\n");
                    break;
                case 4:
                    System.out.print(" Four\n");
                    break;
                case 5:
                    System.out.print(" Five\n");
                    break;
                case 6:
                    System.out.print(" Six\n");
                    break;
                case 7:
                    System.out.print(" Seven\n");
                    break;
                case 8:
                    System.out.print(" Eight\n");
                    break;
                case 9:
                    System.out.print(" Nine\n");
                    break;
            }
            System.out.println("Number convert: " + hundreds + dozens + unit);
        }
    }
}
