import java.util.*;
public class filenameCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        if(s.length() == n){
            int count = 0;
            char ch[] = s.toCharArray();
            for(int i = 0; i < ch.length-2; i++){
                if(ch[i] == 'x' && ch[i+1] == 'x' && ch[i+2] == 'x'){
                    count ++;
                }
            }
            System.out.print(count);
        }
        in.close();
    }
}
