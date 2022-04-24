package ArrayAndMethodsInJava;

import java.util.Scanner;

public class findTheLargetsElementTwoArray {
    public static void main(String[] args) {
        // khao báo số dòng và số cột của ma trận
        int m,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();
// Khai báo ma trận arr có m dòng, n cột;
        int arr[][] = new int [m][n];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        // tìm phần tử có giá trị lớn nhất trong ma trận
        int max =  arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        // hiển thị mảng vừa nhập
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Phần tử lớn nhất trong mảng hai chiều là max = " + max);
//        System.out.println(arr[i][j]);

    }
//    public static int finIndex(int[] arr, int number){
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i][j] == number){
//
//                }
//
//            }
//        }
//    }
}
