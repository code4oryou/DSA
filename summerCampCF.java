import java.util.*;

public class summerCampCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = "";
        for (int i = 1; i <= n + 1; i++) {
            s = s + i;
        }
        System.out.println(s.charAt(n - 1));
        in.close();
    }
}
