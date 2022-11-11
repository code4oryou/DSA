import java.util.*;
public class copyCopyCopyCf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = in.nextInt();

            int count = 1;
            Arrays.sort(arr);
            for(int i = 0; i < n - 1; i++){
                if(arr[i] == arr[i+1]){
                    continue;
                }
                else
                count++;
            }
            System.out.println(count);
        }
        in.close();
    }
}
