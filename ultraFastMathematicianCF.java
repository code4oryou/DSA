import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class ultraFastMathematicianCF{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        String res = "";
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '0'){
                if(b.charAt(i) == '1')
                res = res + 1;
                else
                res = res + 0;
            }
            else{
                if(b.charAt(i) == '0')
                res = res + 1;
                
                else 
                res = res + 0;
                }
        }
        System.out.print(res);
        in.close();
    }
}