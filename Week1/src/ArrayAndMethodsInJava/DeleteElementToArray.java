package ArrayAndMethodsInJava;

import java.util.Scanner;

public class DeleteElementToArray {
    public static void main(String[] args) {
       int n, i, c, index = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng: ");
        n = scanner.nextInt();

        int arr[] = new int[n];

//        System.out.println("Nhập các phần tử của mảng: ");
        for (i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();
//        System.out.println(k);
// tìm vị trí index(i) của k
        for (c = i = 0; i < n; i++) {
            if (arr[i] != k){
                arr[c] = arr[i];
                c++;
            }
            if(arr[i] == k){ // <-- tìm vị trí bị xóa
                int position = i;
                System.out.println("vị trí bị xóa là: " + position);
            }
        }
        n = c;
        System.out.println("Mảng con lại sau khi xóa phần tử " + k + " là: ");
        for ( i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
//    public static int findIndex(int[] arr, int number){
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == number)
//                index = i;
//        }
//        return index;
//    }
}
