import java.util.*;
import static java.lang.Integer.MAX_VALUE;
public class giftsFixingCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n  = in.nextInt();

            int a[] = new int[n];
            int b[] = new int[n];
            int min1 = MAX_VALUE;
            int min2 = MAX_VALUE;

            for(int j = 0; j < n; j++){
                a[j] = in.nextInt();
                min1 = Math.min(a[j], min1);
            }

            for(int j = 0; j < n; j++){
                b[j] = in.nextInt();
                min2 = Math.min(b[j], min2);
            }

            long sum = 0;
            for(int j = 0; j < n; j++){
                sum = sum + (Math.max(a[j] - min1 , b[j] - min2));
            }
            System.out.println(sum);
        }
        in.close();
    }
}
