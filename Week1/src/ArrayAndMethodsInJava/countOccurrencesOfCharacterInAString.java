package ArrayAndMethodsInJava;

import java.util.Scanner;

public class countOccurrencesOfCharacterInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Hello world";
        char KyTu;
        int count = 0;
        System.out.println("Nhập ký tự: ");
        KyTu = scanner.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if(KyTu == str.charAt(i)){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + KyTu + " trong chuỗi " + str + " = " + count);
     }
}
