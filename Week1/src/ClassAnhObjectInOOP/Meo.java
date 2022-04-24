package ClassAnhObjectInOOP;

//    public static void main(String[] args) {
// Khai báo class
public class Meo {
    // Tạo các biến
    String breed;
    String size;
    int age;
    String color;

    // Phương thức lấy thông tin giống mèo
    public String getInfo() {
        return ("Breed is: "+breed+" Size is: "+size+" Age is: "+age+" Color is: "+color);
    }

    // Tất cả sẽ được thực thi từ trong hàm Main
    public static void main(String[] args) {

        // Tạo ra giống 1 con chó giống mèo đen
        Meo den = new Meo();

        // Gán các đặc điểm cho con mèo này
        den.breed = "Đen";
        den.size = "Nhỏ";
        den.age = 2;
        den.color = "Đen";

        // In ra thông tin con mèo đen
        System.out.println(den.getInfo());
    }
}
