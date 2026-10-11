//Maximum Subarray Profit Analysis 
import java.util.*;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum= 0;
        int max = Integer.MIN_VALUE;
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            arr.add(num);
        }
        for(int i=0;i<arr.size();i++){
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        System.out.println("Maximim SubArray sum : " + max);
    }
}
