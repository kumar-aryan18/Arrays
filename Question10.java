
//Frequency of a Element
import java.util.*;
public class Question10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("N :");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int freq =0;
        for(int i=0;i<n;i++){
            int nums = sc.nextInt();
            arr.add(nums);
        }
       for (int i = 0; i < arr.size(); i++) {
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (arr.get(k).equals(arr.get(i))) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) continue; // Skip duplicate (by default value of boolean is false)
            freq = 0;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) freq++;
            }
            
            System.out.println("Element : " + arr.get(i) + " Frequency : " + freq);
        }
        System.out.println();
    }

}
