import java.util.*;
public class gameWithSticksCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int i;
        if(n > m){
            i = m;
        }
        else
            i = n;
        if(i % 2 == 0){
            System.out.println("Malvika");
        }
        else
        System.out.println("Akshat");
        in.close();
    }
}
