package ArrayAndMethodsInJava;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MergeAray {
    public static int min = 1;
    public static int max = 10;
    public static void createArray(int [] arr, int n ){

        for(int i=0;i<n;i++){
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            arr[i] = randomNum;
        }
    }
    public static String printArray(int [] arr1){
        String str = "[";
        for (int i = 0; i < arr1.length; i++) {
            if(i != arr1.length-1){
                str += arr1[i] + ",";
            }else{
                str += arr1[i];
            }
        }
        str += "]";
        return str;
    }

    public static int [] mergeArray(int [] arr1, int [] arr2){
        int index = arr1.length + arr2.length;
        int arr3[] = new int[index];
        int count = 0;
        for (int k = 0;k< arr1.length;k++){
            arr3[k] = arr1[k];
            count++;
        }
        for (int k = 0;k< arr2.length;k++){
            arr3[count++] = arr2[k];
        }
        return arr3;
    }

    public static void insertionSort(int [] arr){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Viet ham Tim gia tri lon nhat cua mang
    // Viet ham Tim gia tri nho nhat cua mang
    // Tim vi tri cua so 5 trong mang
    public static void findIndex(int [] arr3){
        int x = arr3[5];
        System.out.println("Nhập số nguyên cần tìm: ");

    }
    public static void maxMinValue(int [] arr3){
        int max = arr3[0];
        int min = arr3[0];
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > max){
                max = arr3[i];
            }
            if (arr3[i] < min){
                min = arr3[i];
            }

        }
        System.out.println("Giá trị lớn nhất là: " + max);
        System.out.println("Giá trị nhỏ nhất là: " + min);


    }
    public static int findIndex(int[] arr, int number){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number)
                index = i;
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1[] = new int[4];
        int arr2[] = new int[4];

        createArray(arr1, 4);
        System.out.println(printArray(arr1));
        createArray(arr2, 4);
        System.out.println(printArray(arr2));


        int[] arr3 = mergeArray(arr1, arr2);
        System.out.println(printArray(arr3));
        insertionSort(arr3);
        System.out.println(printArray(arr3));
        maxMinValue(arr3);
    }
}
