//Second Largest Distinct Element 

import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N :");
        int n = sc.nextInt();
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
         for(int i=0;i<n;i++){
            int integers = sc.nextInt();
            
            if(integers>firstHighest){
                secondHighest=firstHighest;
                firstHighest = integers;
                
            }
            else if( integers>secondHighest && firstHighest>integers) secondHighest=integers;

        }
        if(secondHighest==Integer.MIN_VALUE)//secondHighest==firstHighest this is not valid because secondHeighest to kbhi change hua hi nhi tha

            System.out.println(-1);
        
        else System.out.println(secondHighest);
    }
}
