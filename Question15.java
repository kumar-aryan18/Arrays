//Row and Column Sum Analyzer 

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int hsb = 0;
        int hs = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            int rowSum = 0;
            for (int j = 0; j < c; j++) {
                rowSum += arr[i][j]; 
            }
            if (hs < rowSum) {//row represents a branch. thats why we use only rowSum for calculating hsb&hs
                hs = rowSum;
                hsb = i + 1; //for 1 based indexing we use i+1 
            }
            System.out.println("Row " + (i + 1) + " Sum: " + rowSum); 
        }

        for (int j = 0; j < c; j++) {
            int colSum = 0;
            for (int i = 0; i < r; i++) {
                colSum += arr[i][j]; 
            }
            System.out.println("Column " + (j + 1) + " Sum: " + colSum); 
        }
        System.out.println("Highest Sales Branch: " + hsb);
        System.out.println("Highest Sales: " + hs);
    }
}