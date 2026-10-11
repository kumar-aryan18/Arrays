// Mutil-Department Matrix Multiplication 

import java.util.*;

public class Question18 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("r1 : ");
        int r1 = sc.nextInt();
        System.out.println("c1 : ");
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("r2 : ");
        int r2 = sc.nextInt();
        System.out.println("c2 : ");
        int c2 = sc.nextInt();
        int[][] arr1 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        if(c1!=r2|| r1!=c2){
            System.out.println("mulplication is not possible");
            return;
        }
        int[][] ans = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {  
                for(int k=0;k<c1;k++){
                    ans[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }  
}
