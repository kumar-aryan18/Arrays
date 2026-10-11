//Student Performance Analy cs System 
import java.util.*;
public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            arr.add(num);
        }
        double sum =0.0;
        double average = 0.0;
        int highest = 0;
        int lowest = Integer.MAX_VALUE;
        int passed =0;
        int failed = 0;
        for(int i=0;i<arr.size();i++){
            if(highest<arr.get(i)) highest = arr.get(i);
            if(lowest>arr.get(i))lowest = arr.get(i);
            sum+= arr.get(i);
            if(arr.get(i)>=40)passed++;
        }
        average = sum/n;
        int aboveaverage = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>average)aboveaverage++;
        }
        System.out.println("Average : " + average);
        System.out.println("Highest : " + highest);
        System.out.println("Lowest : " + lowest);
        System.out.println("Passed : " + passed);
        System.out.println("Failed : " +( arr.size() - passed));
        System.out.println("Above Average : "+ aboveaverage);
        
    }
}
