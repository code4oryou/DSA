
// Day 59
// 1748 A. The ultimate square
// https://codeforces.com/contest/1748/problem/A

import java.util.Scanner;

public class ultimateSquareCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            if (n % 2 == 0) {
                System.out.println(n / 2);
            } else
                System.out.println((n / 2 + 1));
        }
        in.close();
    }
}
