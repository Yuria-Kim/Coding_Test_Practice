import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int i = 1;
      int j = 1;
      int sum = 0;
      
      while(i!=0 && j!=0){
          
          i = sc.nextInt();
          j = sc.nextInt();
          if(i==0 && j==0) break;
          
          sum = i+j;
          System.out.println(sum);
      }
    }
}