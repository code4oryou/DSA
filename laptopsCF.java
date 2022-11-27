// Day 73
// https://codeforces.com/problemset/problem/456/A
// 456 A. Laptops

import java.util.*;

public class laptopsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean bl = false;
        while (n-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (b > a) {
                bl = true;
                break;
            }
        }
        if (bl)
            System.out.println("Happy Alex");
        else
            System.out.println("Poor Alex");
        in.close();
    }
}
