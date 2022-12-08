// Day 84
// https://codeforces.com/problemset/problem/1186/A
// 1186 A. Cossack and Contest

import java.util.*;

public class cossackAndContestCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        if (n <= m && n <= k)
            System.out.println("YES");
        else
            System.out.println("NO");
        in.close();
    }
}
