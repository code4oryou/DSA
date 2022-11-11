import java.util.*;
public class vanyaAndFenceCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int width = 0;
        for(int i = 1; i <= n; i++){
            int a = in.nextInt();
            if(a <= h)
            width = width + 1;
            else
            width = width + 2;
        }
        System.out.print(width);
    }
}
