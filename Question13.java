//Merge Two Sorted Array
import java.util.*;
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N :");
        int n = sc.nextInt();
    
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int j=0;j<n;j++){
            int num = sc.nextInt();
            arr1.add(num);
        }
        System.out.println("M : ");
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int num = sc.nextInt();
            arr2.add(num);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int i= 0;
        int j = 0;
        
        while(i<n && j< m){
            if(arr1.get(i)<arr2.get(j)){
                ans.add(arr1.get(i));
                i++;

            }
            else {
                ans.add(arr2.get(j));
                j++;
            }
            
        }
        while(i<n){
            ans.add(arr1.get(i));
            i++;
        }
        while(j<m){
            ans.add(arr2.get(j));
            j++;
        }
        System.out.println(ans);
        
    }
}
