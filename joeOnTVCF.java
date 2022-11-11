import java.util.*;

public class joeOnTVCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double ans = 0;
        while (n > 0) {
            ans = ans + (double) 1 / n;
            n--;
        }
        System.out.println(ans);
        in.close();
    }
}
