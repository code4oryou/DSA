// Day 63
// 1619 A. Square String
// https://codeforces.com/problemset/problem/1619/A

import java.util.*;

public class squareStringCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            String lS = "";
            String rS = "";
            for (int i = 0; i < s.length() / 2; i++) {
                lS += s.charAt(i);
            }
            for (int i = s.length() / 2; i < s.length(); i++) {
                rS += s.charAt(i);
            }
            if (lS.equals(rS))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        in.close();
    }
}
