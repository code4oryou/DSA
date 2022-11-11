// Day 56
// Boring Apartments
// https://codeforces.com/contest/1433/problem/A

import java.util.*;

public class boringApartmentsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int count = 0;
            for (int i = 1; i <= 9; i++) {
                int sum = 0;
                for (int j = 1; j <= 4; j++) {
                    sum = sum * 10;
                    sum = sum + i;
                    count = count + j;
                    if (sum == n) {
                        System.out.println(count);
                        break;
                    }
                    if (sum == n)
                        break;
                }
            }
        }
        in.close();
    }
}
