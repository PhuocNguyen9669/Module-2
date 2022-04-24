package ArrayAndMethodsInJava;

public class sumNumbersInAColumn {
    public static void main(String[] args) {
        int arr[][] = new int [5][5];
        // Nhập các giá trị ngẫu nhiên của mảng
        System.out.println("Nhập " + arr.length + " rows and "+ arr[0].length + " colums: ");
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr.length; column++) {
                arr[row][column] = (int) (Math.random()* 100);
            }
        }
        // In mảng
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr.length; column++) {
                System.out.print(arr[row][column] + ", ");
            }
            System.out.println("");
        }
        // Tính tổng mỗi cột
        for (int column = 0; column < arr.length; column++) {
            int total = 0;
            for (int row = 0; row < arr.length; row++) {
                total += arr[row][column];
            }
            System.out.println("Sum for column " + column + " is " + total);
        }
        // tính tống các dòng của mảng
        for (int row = 0; row < arr.length ; row++) {
            int total = 0;
            for (int column = 0; column < arr.length; column++) {
                total += arr[row][column];
            }
            System.out.println("Sum for row "+ row + " is " + total);
        }
    }
}

