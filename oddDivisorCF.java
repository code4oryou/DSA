import java.util.*;
public class oddDivisorCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            Double n = in.nextDouble();
            while(n % 2 == 0){
                n = n / 2;
            }
            if(n == 1)
            System.out.println("NO");
            else
            System.out.println("YES");
        }
        in.close();
    }
}
