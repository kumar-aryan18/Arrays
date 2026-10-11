// Matrix Diagonal Analysis 
import java.util.*;
public class Question14 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("N :");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int mainDiagonalSum =0;
        int secondaryDiagonalSum =0;
        int difference = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt() ;
                if(i==j){
                    mainDiagonalSum+=arr[i][j];
                }
                if( i + j == n - 1 ){
                    secondaryDiagonalSum += arr[i][j];
                }

            }
        }
        difference = Math.abs(mainDiagonalSum-secondaryDiagonalSum);
        System.out.println( "mainDiagonalSum : " + mainDiagonalSum);
        System.out.println("secondaryDiagonalSum : "  +secondaryDiagonalSum);
        System.out.println("Difference : "+ difference);


    }
}
