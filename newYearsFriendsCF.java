import java.util.*;

public class newYearsFriendsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();
        int max = Math.max(x1, Math.max(x2, x3));
        int min = Math.min(x1, Math.min(x2, x3));
        System.out.println((max - min));
        in.close();
    }
}
