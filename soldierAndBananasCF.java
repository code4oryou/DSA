import java.util.*;

public class soldierAndBananasCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        int res = k * ((w * (w + 1)) / 2);
        if (res <= n)
            System.out.println(0);
        else
            System.out.println(res - n);
        in.close();
    }
}
