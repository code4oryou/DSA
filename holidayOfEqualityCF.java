import java.util.*;

public class holidayOfEqualityCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int burles[] = new int[n];
        int count = 0;
        int max = -1;
        for (int i = 0; i < n; i++) {
            burles[i] = in.nextInt();
            max = Math.max(max, burles[i]);
        }

        for (int i = 0; i < n; i++) {
            count = count + (max - burles[i]);
        }
        System.out.println(count);
        in.close();
    }
}