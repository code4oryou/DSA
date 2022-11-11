import java.util.*;
public class bitCF{
    public static void main(String args[]){
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        int x = 0;
        for(int i = 0; i < n; i++){
            String s = in.next();
            if(s.equals("X++") || s.equals("++X")){
                x++;
            }
            else 
                x--;
        }
        System.out.print(x);
        in.close();
    }
}