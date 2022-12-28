// Day 102
// https://codeforces.com/problemset/problem/1041/A
// 1041 A. Heist

import java.util.*;

public class heistCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        Arrays.sort(num);
        int count = num[n - 1] - num[0] + 1 - n;
        System.out.println(count);
        in.close();
    }
}
