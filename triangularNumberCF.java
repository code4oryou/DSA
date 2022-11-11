import java.util.*;
public class triangularNumberCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int flag = 0;
        for(int i = 0; sum <= n; i++){
            sum += i;
            if(sum == n)
            flag = 1;
        }
        if(flag == 0)
        System.out.println("NO");
        else
        System.out.println("YES");
        in.close();
    }
}
