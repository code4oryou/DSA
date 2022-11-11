import java.util.Scanner;
public class abbreviationCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str;
        for(int i = 0; i < n; i++){
            str = in.nextLine();
            str = str.toLowerCase();
            int l = str.length();
            if(l>=10)
            System.out.println(str.charAt(0) + (l-2) + str.charAt(l-1));
            else
            System.out.println(str);
        }
    }
    }
}
