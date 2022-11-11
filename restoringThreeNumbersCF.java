import java.util.*;

public class restoringThreeNumbersCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int a = in.nextInt();
            arr.add(a);
        }
        Collections.sort(arr, Collections.reverseOrder());
        System.out
                .println((arr.get(0) - arr.get(1)) + " " + (arr.get(0) - arr.get(2)) + " " + (arr.get(0) - arr.get(3)));
        in.close();
    }
}
