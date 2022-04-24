package LoopInJava;

import java.util.Scanner;

public class ShowNumbers100Prime {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập n");
        int numbers = 100;


        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)==true) {
                System.out.println(" " + i);
            }
        }



    }
    public static boolean isPrimeNumber(int n){
        // Neu N<2 ko phai so nguyen to
        // Neu N>2
        // Kiem tra N co chia het cac so tu (n-1) -> 2 hay khong
        if (n < 2){
            return false;
        } else {
            for(int i=2;i<n-1;i++){
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }
}
