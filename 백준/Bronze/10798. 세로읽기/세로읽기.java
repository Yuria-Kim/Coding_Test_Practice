import java.util.*;

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int l_size = 0;
      String letters[] = new String[5];
      for(int i = 0 ; i<5; i++){
          String temp = sc.next();
          int temp2 = temp.length();
          letters[i] = temp;
          if(temp2>l_size){
              l_size = temp2;
          }
      }
      String answer = "";
      for (int i = 0; i<l_size; i++){
          for(int j = 0; j<letters.length; j++){
              if(letters[j].length()<=i) continue;
              answer = answer.concat(letters[j].substring(i,i+1));
          }
      }
      System.out.println(answer);
    }
}