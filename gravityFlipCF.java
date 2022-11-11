import java.util.Scanner;

import java.util.*;
public class gravityFlipCF {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n[] = new int[num];
        for(int i = 0; i < num; i++){
            n [i] = in.nextInt();
        }
        Arrays.sort(n);
        for(int i = 0; i < num; i++){
            System.out.print(n[i] + " ");
        }
        in.close();
    }
}
