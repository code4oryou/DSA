import java.util.*;
public class problem155aCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr [] = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
                count++;
            }
            else if(arr[i] < min){
                min = arr[i];
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
