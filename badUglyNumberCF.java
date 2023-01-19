import java.util.*;

public class badUglyNumberCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            if (n == 1) {
                System.out.println(-1);
            } else {
                System.out.print("2");
                for (int i = 1; i < n; i++) {
                    System.out.print(3);
                }
                System.out.println();
            }
        }
        in.close();
    }
}
