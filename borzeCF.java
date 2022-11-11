import java.util.*;

public class borzeCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String exp = in.nextLine();
        String temp = "";
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '.') {
                temp = temp + '0';
            }

            else if (exp.charAt(i) == '-' && exp.charAt(i + 1) == '.') {
                temp = temp + '1';
                ++i;
            }

            else if (exp.charAt(i) == '-' && exp.charAt(i + 1) == '-') {
                temp = temp + '2';
                ++i;
            }
        }
        System.out.println(temp);
        in.close();
    }
}