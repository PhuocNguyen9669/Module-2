package ArrayAndMethodsInJava;

import java.util.Scanner;
import java.util.Random;
public class findTheSmallestValueArray {
    public static void main(String[] args) {
        int size = 10;
        int arr[] = new int[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mảng có số phần tử là: " + size);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        int min =  arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
//        System.out.println(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
