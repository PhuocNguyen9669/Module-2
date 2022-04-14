public class DemoWhile{
    public static void main(String []args){
        int num = 0, count = 0;
        while (count < 4){
            if(num % 4 == 0 ) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}