import java.util.*;

public class littleArtemAndPresentsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1 = n / 3;
        int n2 = n % 3;
        if (n2 == 0)
            System.out.println(2 * n1);
        else
            System.out.println(2 * n1 + 1);
        in.close();
    }
}
