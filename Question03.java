// Find Maximum and Minimum 
import java.util.*;
public class Question03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N :");
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int integers = sc.nextInt();
            if(integers>max)max =integers;
            if(integers<min) min = integers;

        }
        System.out.println("Maximum  : "+max);
        System.out.println("Minimum : " + min);
    }
}
