import java.util.*;
public class vasyaTheHipsterCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a >= b){
            a = a - b;
            a = a / 2;
            System.out.println(b + " " + a);
        }
        else{
            b = b - a;
            b = b / 2;
            System.out.println(a + " " + b);
        }
        in.close();
    }
}
