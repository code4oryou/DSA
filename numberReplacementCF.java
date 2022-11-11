import java.util.*;
public class numberReplacementCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = in.nextInt();
            }
            String s = in.next();
            char wrd[] = s.toCharArray();
            char ch[] = new char[n];
            int spare[] = new int[n];
            for(int i = 0; i < n; i++){
                spare[i] = a[i];
                for(int j = 0; j < n; j++){
                    if(spare[i] == a[j]){
                        ch[j] = s.charAt(i);
                    }
                }
            }
            if(Arrays.equals(ch, wrd))
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        in.close();
    }
}
