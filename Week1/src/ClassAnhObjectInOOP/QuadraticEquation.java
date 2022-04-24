package ClassAnhObjectInOOP;
import java.util.Scanner;
public class QuadraticEquation {
    private double a,b,c,r1,r2,r3,r4;
    private double delta;
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double geta(){
        return a;
    }
    public double getb(){
        return b;
    }
    public double getc(){
        return c;
    }
    // Phươnn thức tính delta
    public double getDiscriminant(){
        return delta = (b * b) - (4 * a * c);
    }
    // Phương thức tính nghiệm 1
    public double getRoot1(){
        return  r1 = (-b + Math.pow(delta,0.5)) / (2*a);
    }
    // Phương thức nghiệm 2
    public double getRooot2(){
        return r2 = (-b - Math.pow(delta,0.5)) / (2*a);
    }
    // phương thức 1 nghiệm
    public double getRoot3(){
        return  r3 = (-c / b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("nhập c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("delta = " + delta);

        if(a == 0){
            if(b==0){
                System.out.println(("Phương trình vô nghiệm"));
            } else {
                System.out.println("Phương trình có một nghiệm: " + quadraticEquation.getRoot3() );
            }

        } else {
            if(delta > 0){
                System.out.println("Phương trình có 2 nghiệm là: r1 =" + quadraticEquation.getRoot1() + " và r2 = " + quadraticEquation.getRooot2() );
            } else if (delta == 0){
                System.out.println("Phương trình có một nghiệm kép: r1 = r2 " + (-b/(2*a)));
            } else if(delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}

