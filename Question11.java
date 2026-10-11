// Remove Duplicate Elements 
import java.util.*;
public class Question11 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("N :");
        int n = sc.nextInt();
         ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int nums = sc.nextInt();
            arr.add(nums);
        }
        for(int i=0;i<arr.size();i++){
             for (int k = 0; k < i; k++) {
                if (arr.get(k).equals(arr.get(i))) {
                    arr.remove(i);
                }
            }
        }
        System.out.println(arr);
    }
}
