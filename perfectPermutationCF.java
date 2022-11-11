import java.util.*;
public class perfectPermutationCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n % 2 == 1)
        System.out.println(-1);
        else{
            System.out.print("2 1 ");
            for(int i = 3; i < n; i += 2){
                System.out.print(" ");
                System.out.print((i+1) +" "+ (i));
            }
            System.out.println();
        }
        in.close();
    }
}
