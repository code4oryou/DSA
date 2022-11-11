import java.util.*;

public class shortSubstringsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            int len = s.length();
            String str = "";
            for (int i = 0; i < len - 1; i += 2) {
                System.out.print(s.charAt(i));
            }
            System.out.println(s.charAt(len - 1));
        }
        in.close();
    }
}