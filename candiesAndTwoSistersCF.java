import java.util.*;
public class candiesAndTwoSistersCF{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        double result = 0;
        while(t-- > 0){
            double n = in.nextDouble();
            result = Math.ceil((n/2)-1);
            System.out.println((int)result);
        }
        in.close();
    }
}