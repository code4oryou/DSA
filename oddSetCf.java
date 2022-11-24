// Day 70
// https://codeforces.com/problemset/problem/1542/A
// 1542 A. Odd Set

import java.util.*;

public class oddSetCf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int evens = 0;
        int odds = 0;
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            for (int j = 0; j < 2 * n; j++) {
                int no = in.nextInt();
                if (no % 2 == 0)
                    evens++;
                else
                    odds++;
            }
            if (odds == evens)
                System.out.println("Yes");
            else
                System.out.println("No");
            odds = 0;
            evens = 0;
        }
        in.close();
    }
}
