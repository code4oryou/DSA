import java.util.*;
public class georgeAndAccomodationCF {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            int p = in.nextInt();
            int q = in.nextInt();
            if(p + 2 <= q)
            count++;
        }
        System.out.print(count);
    }
}
