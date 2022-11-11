import java.util.*;
public class wrongSubstractionCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        while(k > 0){
            if(n % 10 != 0)
            n = n-1;
            else if(n % 10 == 0)
            n = n/10;
            k--;
        }
        System.out.print(n);
    }
}
