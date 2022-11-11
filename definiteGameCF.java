import java.util.*;

public class definiteGameCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 3)
            System.out.println(1);
        else
            System.out.println(n);
        in.close();
    }
}