import java.util.*;

public class multiplicationTableCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int count = 0, digit = 0;
        for (int i = 1; i <= n; i++) {
            if (x % i == 0 && x / i <= n)
                count++;
        }
        System.out.println(count);
        in.close();
    }
}
