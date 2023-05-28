import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int num[] = new int[2];
      int reverse_arr[] = new int[2];

      for(int i = 0; i<2; i++){
          num[i] = sc.nextInt();
          int reverse = 0;
          while(num[i]!=0){
              int temp = num[i] % 10;
              reverse = reverse*10 + temp;
              num[i] /= 10;
              reverse_arr[i]=reverse;
          }
      }
      int answer = reverse_arr[0];
      for (int j = 1; j<2; j++){
          if(reverse_arr[j]>answer) answer = reverse_arr[j];
      }
      System.out.println(answer);
    }
}