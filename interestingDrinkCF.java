// Day 115
// https://codeforces.com/problemset/problem/706/B
// 706 B. Interesting Drink

import java.util.*;

public class interestingDrinkCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        Arrays.sort(ar);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int ans = BS(ar, x);
            System.out.println(ans);
        }
    }

    static int BS(int ar[], int x) {
        int low = 0, high = ar.length - 1, ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (ar[mid] <= x) {
                ans = mid + 1;
                low = mid + 1;
            } else if (ar[mid] > x)
                high = mid - 1;
        }
        return ans;
    }
}
