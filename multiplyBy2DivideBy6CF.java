import java.util.*;
public class multiplyBy2DivideBy6CF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int count = 0;
            int N = n;
            while(N != 1){
                if(N % 6 == 0){
                    N = N / 6;
                    count++;
                }
                else if(N % 3 == 0){
                    N = N * 2;
                    count++;
                }
                else{
                    count = -1;
                    break;
                }
            }
            System.out.println(count);
        }
        in.close();
    }
}
