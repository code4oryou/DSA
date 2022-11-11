import java.util.*;
public class helpfulMathsCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.next().replace("+", "");
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        for(int i = 0; i < s.length(); i++){
            if(i == 0){
                System.out.print(ch[i]);
            }
            else
                System.out.print("+" + ch[i]);
        }

    }
}
