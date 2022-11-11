import java.util.*;

public class luckyNumberCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        long temp = 2; // since the doorplates consists of 2 numbers
        for (int i = 1; i <= n; i++) {
            sum = sum + temp;
            temp = temp * 2;
        }
        System.out.println(sum);
    }
}
