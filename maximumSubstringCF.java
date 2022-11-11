import java.util.*;

public class maximumSubstringCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a = 0, b = 0;
        while (t-- > 0) {
            int n = in.nextInt();
            String s = in.nextLine();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1')
                    a++;
                else
                    b++;
            }
            int ans = a * b;
            int c = 0;
            int d = 0;
            int maxC = 0;
            int maxD = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    c++;
                    maxC = Math.max(maxC, c);
                } else
                    c = 0;
            }
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    d++;
                    maxD = Math.max(maxD, d);
                } else
                    d = 0;
            }
            maxC = maxC * maxC;
            maxD = maxD * maxD;
            int res = Math.max(ans, Math.max(maxC, maxD));
            System.out.println(res);
        }
        in.close();
    }
}
