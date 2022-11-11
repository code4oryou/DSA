
// Day 56
// Magical Sticks
// https://codeforces.com/problemset/problem/1371/A
import java.util.*;

public class magicalSticksCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            if (n % 2 == 0)
                System.out.println(n / 2);
            else
                System.out.println((n / 2) + 1);
        }
        in.close();
    }
}
