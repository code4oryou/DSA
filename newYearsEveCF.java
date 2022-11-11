
import java.util.*;
public class newYearsEveCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int a = n % 2020;
            int b = n / 2020;
            if(a > b){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        in.close();
    }    
}
