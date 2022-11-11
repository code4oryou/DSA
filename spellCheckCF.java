import java.util.*;
public class spellCheckCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String nam = "Timur";
        char ch[]= nam.toCharArray();
        Arrays.sort(ch);
        nam = String.valueOf(ch);
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            String s = in.next();
            char c[] = s.toCharArray();
            Arrays.sort(c);
            s = String.valueOf(c);
            if(nam.equals(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        in.close();
    }
}
