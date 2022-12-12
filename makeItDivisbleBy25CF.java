// Day 88 
// https://codeforces.com/problemset/problem/1593/B
// 1593 B. Make it Divisible by 25

import java.util.*;

public class makeItDivisbleBy25CF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (((s.charAt(i) - '0') * 10 + (s.charAt(j) - '0')) % 25 == 0) {
                        ans = s.length() - i - 2;
                    }
                }
            }
            System.out.println(ans);
        }
        in.close();
    }
}
