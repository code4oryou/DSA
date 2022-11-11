import java.util.*;
public class dominoPilingCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int res = (m*n)/2;
        System.out.print(res);
        in.close();
    }
}
