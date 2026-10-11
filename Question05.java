//Reverse an Array 

import java.util.*;

public class Question05 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("N :");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int Integers = sc.nextInt();
            list.add(Integers);
        }
        int i = 0;
        int j = list.size()-1;
        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);

            i++;
            j--;
        }
        
        System.out.println(list);
    }
}
