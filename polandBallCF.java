import java.util.*;

public class polandBallCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            System.out.println(3);
        } else if (n == 2) {
            System.out.println(4);
        } else {
            System.out.println(n - 2);
        }
        in.close();
    }
}
