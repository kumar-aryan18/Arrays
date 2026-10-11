//Count Even and Odd Elements 
import java.util.*;
public class Question02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("NuMBER OF INTEGER : ");
        int n = sc.nextInt();
        int even =0;
        int odd = 0;
        for(int i=0;i<n;i++){
            int integers = sc.nextInt();
            if(integers %2==0)even++;
            else odd++;
        }
        System.out.println("Even :" + even);
        System.out.println("Odd :" + odd);
    }
}
