// Count Positive, Negative and Zero 

import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("N :");
        int n = sc.nextInt();
        int zero=0;
        int positive =0;
        int negative =0;
        for(int i=0;i<n;i++){
            int integers = sc.nextInt();
            if(integers ==0 ) zero++;
            else if(integers>0 ) positive++;
            else  negative++;

        }
        System.out.println("Zero :" + zero);
        System.out.println("Positive :" + positive);
        System.out.println("Negative :" + negative);
    }
    
}
