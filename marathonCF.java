import java.util.*;

public class marathonCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int count = 0;
            if (a < b)
                count++;
            if (a < c)
                count++;
            if (a < d)
                count++;
            System.out.println(count);
        }
        in.close();
    }
}
