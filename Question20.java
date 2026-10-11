//Saddle Point and Matrix Analysis 

import java.util.*;

public class Question20 {
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
        boolean found = false;
        for (int i = 0; i < r; i++) {
            int rowMin = arr[i][0];
            int colIdx = 0;
            for (int j = 0; j < c; j++) {
               if(arr[i][j] <rowMin){
                rowMin =arr[i][j]; 
                colIdx=j;
               }
            }
            boolean isSaddle = true;
            for (int k = 0; k < r; k++) {
                if (arr[k][colIdx] > rowMin) {
                    isSaddle = false;
                    break;
                }
            }

            // 3. If it satisfies both conditions, we found the saddle point
            if (isSaddle) {
                System.out.println("Saddle Point: " + rowMin + " row : " +  (i + 1) + " Column: " + (colIdx + 1));
                found = true;
                break;
            }
        }
        if(!found)System.out.println("No Saddle point : ");

     
    }
}
