import java.util.*;

public class nightAtMuseumCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count = 0;
        char ch = 'a';
        for (int i = 0; i < s.length(); i++) {
            int temp = (int) s.charAt(i);
            int chInt = (int) ch;
            count = count + Math.min(Math.abs(chInt - temp), 26 - (Math.abs(chInt - temp)));
            ch = s.charAt(i);
        }
        System.out.println(count);
        in.close();
    }
}
