// Day 62
// 1669 A. Division
// https://codeforces.com/problemset/problem/1669/A

import java.util.Scanner;

public class divisionCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = in.nextInt();
            if (n >= 1900)
                System.out.println("Division 1");
            else if (n >= 1600 && n <= 1899)
                System.out.println("Division 2");
            else if (n >= 1400 && n <= 1599)
                System.out.println("Division 3");
            else if (n <= 1399)
                System.out.println("Division 4");
        }
        in.close();
    }
}
