import java.util.*;
public class newYearAndHurryCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0, pro = 0;
        for(int  i = 1; i <= n; i++){
            pro += 5 * i;
            if(pro <= (240-k))
            count++;
            else
            break;
        }
        System.out.println(count);
        in.close();
    }
}
