import java.util.*;
public class antonAndDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k2 = in.nextInt();
        int k3 = in.nextInt();
        int k5 = in.nextInt();
        int k6= in.nextInt();
        int sum = 0;
        while(k2 >= 1){
            if(k5 >= 1 && k6 >= 1){
                sum = sum + 256;
                k2--;
                k5--;
                k6--;
            }
            else if(k2 >= 1 && k3 >= 1){
                sum = sum + 32;
                k2--;
                k3--;
            }
            else{
                break;
            }
        }
        System.out.println(sum);
        in.close();
    }
}
