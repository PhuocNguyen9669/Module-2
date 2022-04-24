package ArrayAndMethodsInJava;

import java.util.Arrays;

public class AddElementToArray {

    public static String printArray(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i] + "]";
            }else{
                str += arr[i] + " , ";
            }
        }
        return str;
    }

    public static int [] addElementToArray(int value, int index, int[] arr) {
        //
        if (index <= 0 || index > arr.length) {
            return null;
        }else{
            int [] arrNew = Arrays.copyOf(arr,arr.length + 1 );
            for (int i = arrNew.length - 2; i >= index ; i--) {
                arrNew[i + 1] = arrNew[i];
            }
            arrNew[index] = value;
            return arrNew;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 9};
        System.out.println(printArray(arr));

        int[] a = addElementToArray(-1, 5, arr);

        System.out.println(printArray(a));




        /*int[] a = new int[10];
        int addIndex = 1;
        int value = 7;
        int n = 9;
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
            System.out.print("Before inserting: ");
            for (int element : a) {
                System.out.print(element + " ");
            }
            System.out.println();
            for (int i = n; i > addIndex; i--) {
                a[i] = a[i - 1];
            }
            a[addIndex] = value;
            System.out.print("After inserting: ");
            for (int element : a) {
                System.out.print(element + " ");
            }
//            System.out.println();*/
        }
    }
