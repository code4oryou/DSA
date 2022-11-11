import java.util.*;

public class taymyrIsCallingCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int sum = 0;
        while (k != 0) {
            if (k % n == 0 && k % m == 0)
                sum = sum + 1;

            k--;
        }
        System.out.println(sum);
        in.close();
    }
}
