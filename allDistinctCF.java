// Day 86
// https://codeforces.com/problemset/problem/1692/B
// 1692 B. All Distinct

import java.util.*;

public class allDistinctCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int arr[] = new int[n];
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
                set.add(arr[i]);
            }
            int len = arr.length - set.size();
            if (len % 2 == 0) {
                System.out.println(set.size());
            } else {
                System.out.println(set.size() - 1);
            }
        }
        in.close();
    }
}
