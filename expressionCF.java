
// Day 61
// 479 A. Expression
// https://codeforces.com/problemset/problem/479/A
import java.util.*;

public class expressionCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int x = a + b + c;
        int y = a * (b + c);
        int p = a * b * c;
        int o = (a + b) * c;
        int max = x;
        if (y > max)
            max = y;
        if (p > max)
            max = p;
        if (o > max)
            max = o;
        System.out.println(max);
        in.close();
    }
}
