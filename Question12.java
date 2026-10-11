//Move Zeros to End 

import java.util.*;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N :");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int nums = sc.nextInt();
            arr.add(nums);
        }
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==0) {
                count++;
                continue;
            }
            else {
                int num = arr.get(i);
                ans.add(num);
            }
        }
        for(int i=0;i<count;i++){
            ans.add(0);
        }
        System.out.println(ans);
    }
}
