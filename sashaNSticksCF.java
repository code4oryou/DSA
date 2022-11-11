import java.util.*;

public class sashaNSticksCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextLong();
        if ((n / k) % 2 == 0)
            System.out.println("NO");
        else
            System.out.println("YES");
        in.close();
    }
}
