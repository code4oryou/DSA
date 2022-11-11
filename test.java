import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5785;
        String s = Integer.toString(n);
        char ch;
        int flag = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            ch = s.charAt(i);
            if (s.charAt(s.length() - 1) < s.charAt(s.length() - 2)) {
                if (ch < s.charAt(i + 1))
                    flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Not a Special Chemical");
        } else {
            System.out.println("Special Chemical");
        }
        in.close();
    }
}
