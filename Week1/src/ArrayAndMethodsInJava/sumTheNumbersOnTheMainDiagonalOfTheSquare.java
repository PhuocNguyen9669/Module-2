package ArrayAndMethodsInJava;

import java.util.Scanner;

public class sumTheNumbersOnTheMainDiagonalOfTheSquare {
    public static void main(String[] args) {
        int[][] Array = new int [3][3];
        Scanner scanner = new Scanner(System.in);
        // Nhập các giá trị của mảng
        System.out.println("Enter " + Array.length + " rows and " + Array[0].length + " columns: ");
        for (int row = 0; row < Array.length; row++) {
            for (int column = 0; column < Array.length; column++) {
                System.out.println("Nhập phần tử thứ [" + row + "][" + column + "]: ");
                Array[row][column] = scanner.nextInt();
            }
        }
        // hiển thị ma trận hình vuông
        System.out.println("Ma trận vừa nhập: ");
        for (int row = 0; row < Array.length; row++) {
            for (int column = 0; column < Array.length; column++) {
                System.out.print(Array[row][column] + ", ");
            }
            System.out.println();
        }
        // Tính tổng đường chéo trong ma trận hình vuông
        int total = 0;
        for (int row = 0; row < Array.length; row++) {
            for (int column = 0; column < Array.length; column++) {
                if(row == column){ //Nếu row = column thì mới tính tổng
                    total += Array[row][column];
                }
            }
        }
        System.out.println("Tổng của đường chéo chính trong hình vuông là: " + total);
    }
}
