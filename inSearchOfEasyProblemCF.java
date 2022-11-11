import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class inSearchOfEasyProblemCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int flag = 0;
        for(int i = 0; i < n; i++){
            int input = in.nextInt();
            if(input == 1)
            flag = 1;
        }
        if(flag == 1)
        System.out.print("HARD");
        else 
        System.out.print("EASY");
        in.close();
    }
}
