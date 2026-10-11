//Matrix Transpose 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Rows:");
        int r = sc.nextInt();
        System.out.println("Cols : ");
        int c = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
       
        for(int i=0;i<r;i++){
            List<Integer> list2 = new ArrayList<>();
            for(int j=0;j<c;j++){
            int num = sc.nextInt();
            list2.add(num);
            }
            list.add(list2);
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<c;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<r;j++){
                row.add(list.get(j).get(i));
            }
            result.add(row);
        }
        System.out.println(result);
        
    }
}
