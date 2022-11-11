import java.util.*;
public class vasyaAndSocksCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = n;
        while(n >= m){
            sum = sum + (n/m);
            n = (n/m) + (n%m);
        }
        System.out.println(sum);
        in.close();
    }
}
