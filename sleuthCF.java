import java.util.*;

public class sleuthCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String letter = in.nextLine().replaceAll(" ", "").toLowerCase();
        int length = letter.length();
        char x = letter.charAt(length - 2);
        if (x >= 'a' && x <= 'z') {
            switch (x) {
                case 'a':

                case 'e':

                case 'i':

                case 'o':

                case 'u':

                case 'y':
                    System.out.print("YES");
                    break;
                default:
                    System.out.print("NO");
            }

        }
    }
}
