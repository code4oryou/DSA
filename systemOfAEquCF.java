import java.util.*;
public class systemOfAEquCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a, b;
        int count = 0;
        for(a = 0; a * a <= n; a++){
            b = n - a * a;
            if(m == (b * b) + a)
            count ++;
        }
        System.out.println(count);
        in.close();
    }
}
