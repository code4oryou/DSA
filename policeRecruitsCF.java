import java.util.*;
public class policeRecruitsCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int recr;
        int pol = 0;
        for(int i = 0; i < n; i++){
            recr = in.nextInt();
            if(recr == -1){
                if(pol > 0){
                    pol = pol - 1;
                }
                else
                count ++;
            }
            else
            pol = pol + recr;
        }
        System.out.print(count);
        in.close();
    }
}
