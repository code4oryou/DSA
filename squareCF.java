import java.util.*;
public class squareCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            if((a==c  && b+d ==c) || (a==d && b+c==a) ||(b==c && a+d==b) || (b==d && a+c==b)){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
        in.close();
    }
}
