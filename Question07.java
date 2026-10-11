//Matrix Addition 
import java.util.*;
public class Question07 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Rows:");
        int r = sc.nextInt();
        System.out.println("Cols : ");
        int c = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for(int k=0;k<2;k++){
            for(int i=0;i<r;i++){
                List<Integer> list2 = new ArrayList<>();
               for(int j=0;j<c;j++){
                int num = sc.nextInt();
                list2.add(num);
               }
               list.add(list2);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<r;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<c;j++){
                int sum = list.get(i).get(j) + list.get(i + r).get(j);
                row.add(sum);
            }
            result.add(row);
        }
        System.out.println(result);
    }
}
