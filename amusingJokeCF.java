import java.util.*;
public class amusingJokeCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        String word = in.next();
        String all = s1 + s2;
        char wrd[] = word.toCharArray();
        char allll[] = all.toCharArray();
        Arrays.sort(wrd);
        Arrays.sort(allll);

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
 
        for(int i = 0; i < wrd.length; i++) {
            sb.append(wrd[i]);
           }
        for(int i = 0; i < allll.length; i++) {
            sb2.append(allll[i]);
           }
 
        if(sb.toString().equals(sb2.toString()))
        System.out.println("YES");
        else
        System.out.println("NO");
        in.close();
    }
}
