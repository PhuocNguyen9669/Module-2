package ClassAnhObjectInOOP;

import java.util.Scanner;
// khai báo class
public class RectangularLayer {
    double width;
    double height;
// khởi tạo hàm Contructor mặc định
    public RectangularLayer(){
    }
    // khởi tạo hàm contructor mới có truyền vào tham số
    public RectangularLayer(double width, double height){
        this.width = width;
        this.height = height;
    }
    // khai báo phương thức tính chu vi hình chữ nhật
    public double getPremeter(){
        return (this.width + this.height)*2;
    }
    // khai báo phương thức tính diện tích hình chữ nhật
    public double getArea(){
        return this.width * this.height;
    }
    // khai báo phương thức hiển thị hình chữ nhật
    public String display(){
        return "Retangle {" + "width =" + width + ", height = " + height + "}";
    }
// thực thi phương thức trong hàm main. runtime
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the length of the rectangle: ");
        double height = scanner.nextDouble();
        RectangularLayer rectangle = new RectangularLayer(width, height);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter of rentangle is: " + rectangle.getPremeter());
        System.out.println("Area of rectangle is: " + rectangle.getArea());

    }
}

