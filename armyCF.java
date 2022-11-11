import java.util.*;

public class armyCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ranks[] = new int[100];
        int sum = 0;
        int a, b;

        for (int i = 0; i < n - 1; i++)
            ranks[i] = in.nextInt();

        a = in.nextInt();
        b = in.nextInt();
        for (int i = a; i < b; i++) {
            sum = sum + ranks[i - 1];
        }
        System.out.println(sum);
        in.close();
    }
}