
// Day 57
// 1676 A. Lucky?
// https://codeforces.com/problemset/problem/1676/A
import java.util.*;

public class luckyCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int lastDigits = n % 1000;
            int firstDigits = n / 1000;
            int sum1 = 0;
            int sum = 0;
            for (int i = 1; i <= 3; i++) {
                sum1 = sum1 + (lastDigits % 10);
                lastDigits /= 10;
                sum = sum + (firstDigits % 10);
                firstDigits /= 10;
            }
            if (sum1 == sum)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
