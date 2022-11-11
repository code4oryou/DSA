import java.util.*;

public class bachgoldProblemCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 2 == 0) {
            System.out.println(n / 2);
            for (int i = 0; i < n / 2; i++) {
                System.out.print(2 + " ");
            }
        } else {
            System.out.println(n / 2);
            for (int i = 0; i < n / 2 - 1; i++) {
                System.out.print(2 + " ");
            }
            System.out.print(3 + " ");
        }
        System.out.println();
        in.close();
    }

}
