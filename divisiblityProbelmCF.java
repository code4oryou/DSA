import java.util.*;
public class divisiblityProbelmCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 1; i <= t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            if(a % b == 0)
            System.out.println(0);
            else{
                int num = a % b;
                System.out.println((b - num));
            }
        }
        
        in.close();
    }
}

// while(a > 0){
//                 if(a % b == 0){
//                     mov ++;
//                     System.out.print(mov);
//                     break;
//                 }
//                 else{
//                     a++;
//                 }
//             }