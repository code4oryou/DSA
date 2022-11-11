import java.util.*;
public class vasyaAndCoinsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int sum = 0;
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            if(a == 0){
                System.out.println("1");
            }
            else{
                sum = a*1 + b*2 + 1;
                System.out.println(sum);
            }
        }
        in.close();
    }
}
