import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Number of students :");
    int n = sc.nextInt();
    double Sum = 0;
    double average;
    for(int i=0;i<n;i++){
        int marks = sc.nextInt();
        Sum += marks;

    }
    average = Sum/n;
     System.out.println("Total Marks : " + Sum);
     System.out.println("Äverage : "+ average );  
   } 
}
