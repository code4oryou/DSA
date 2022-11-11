import java.util.*;
public class sumCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(a == (b+c) || b == (a+c) || c == (a+b))
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        in.close();
    }
}
