import java.util.*;
public class stripesCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int flag;
        int r;
        while(t-- > 0){
            String s[] = new String[8];
            for(int i = 0; i < 8; i++){
                s[i] = in.next();
            }
            flag = 0;
            for(int p = 0; p < 8; p++){
                r = 0;
                for(int q = 0; q < 8; q++){
                    if(s[p].charAt(q) == 'R')
                    r++;
                }
                if(r == 8){
                flag = 1;
                break;
                }
            }
            if(flag == 1)
            System.out.println("R");
            else
            System.out.println("B");
        }
        in.close();
    }
}
