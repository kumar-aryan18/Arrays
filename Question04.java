// Search an Element 

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("N :");
        int n = sc.nextInt();
        System.out.println("Target Element  :");
        int target = sc.nextInt();
        int ans =0;
        for(int i=0;i<n;i++){
            int integers = sc.nextInt();
            if(integers == target) ans =i;
            else ans = -1;
        }
        System.out.println("Index : " + ans);
    }
}
