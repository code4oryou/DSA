import java.util.*;

public class compoteCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int sum = 0;
        while (a >= 1 && b >= 2 && c >= 4) {
            sum = sum + 1 + 2 + 4;
            a--;
            b -= 2;
            c -= 4;
        }
        if (sum == 0) {
            System.out.println("0");
        } else {
            System.out.println(sum);
        }
        in.close();
    }
}
