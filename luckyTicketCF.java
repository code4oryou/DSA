import java.util.*;
public class luckyTicketCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int sum1 = 0, sum2 = 0;
        boolean bl = true;
        for(int i = 0; i < n; i++){
            if((s.charAt(i) != '4' && s.charAt(i) != '7') && (n / 2 != 0)){
                bl = false;
                break;
            }
            else{
                if(i < n / 2){
                    sum1 = sum1 + s.charAt(i) - '0';
                }
                else{
                    sum2 = sum2 + s.charAt(i) - '0';
                }
            }
        }
        if(sum1 == sum2 && bl == true)
        System.out.println("YES");
        else
        System.out.println("NO");
        in.close();
    }
}

