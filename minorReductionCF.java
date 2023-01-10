// Day 117
// https://codeforces.com/problemset/problem/1626/B
// 1626 B. Minor Reductions

import java.util.*;

public class minorReductionCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            String s = in.next();
            String hold = "";
            for (int i = s.length() - 1; i > 0; i--) {
                int sum = s.charAt(i - 1) - '0' + s.charAt(i) - '0';
                if (sum >= 10) {
                    hold = s.substring(0, i - 1) + sum + s.substring(i + 1);
                    break;
                }
            }
            if (hold.length() == 0) {
                int sum = s.charAt(0) - '0' + s.charAt(1) - '0';
                hold = sum + s.substring(2);
            }
            System.out.println(hold);
        }
        in.close();
    }
}
