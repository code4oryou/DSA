import java.util.*;

public class twoIntegersProblemCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t, a, b;
        t = in.nextInt();
        while (t-- > 0) {
            a = in.nextInt();
            b = in.nextInt();
            int sol = Math.abs(a - b) / 10 + Math.min(Math.abs(a - b) % 10, (int) 1);
            System.out.println(sol);
        }
        in.close();
    }
}
