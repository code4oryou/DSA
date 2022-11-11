import java.util.*;
public class buyAShovelCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int r = in.nextInt();
        int count  = 1;
        int sum = 0;
        for(int i = 2; i > 0; i++){
            sum = sum + k;      //increasing count of shovels, 2 shovels, 3 shovels
            if(sum % 10 == 0){
                System.out.println(count);
                break;
            }
            
            else if(sum % 10 == r){
                System.out.println(count);
                break;
            }
            count ++;  
        }
        in.close();
    }
}
