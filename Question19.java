//Spiral Matrix Traversal 

import java.util.*;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("r : ");
        int r = sc.nextInt();
        System.out.println("c : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
       int top = 0;
        int bottom = r - 1;
        int left = 0;
        int right = c - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                ans.add(arr[top][j]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans.add(arr[i][right]);
            }
            right--; 
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans.add(arr[bottom][j]);
                }
                bottom--; 
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++; 
            }
        }

        
        System.out.println(ans);
    }
}
