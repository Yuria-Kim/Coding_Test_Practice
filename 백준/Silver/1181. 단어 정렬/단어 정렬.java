import java.util.*;

public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int cnt = sc.nextInt();
      String words[] = new String[cnt];
      for (int i = 0; i<words.length; i++){
          words[i] = sc.next();
      }
      Arrays.sort(words);
      
      int max = 0;
      String result[] = new String[cnt];
      int len[] = new int[cnt];
      for(int i = 0; i<len.length; i++){
          len[i] = words[i].length();
          if(len[i] > max) max = len[i];
      }
      for(int i = 1; i<=max; i++){
          for(int j = 0; j<len.length; j++){
              if(len[j] == i){
                  if(j>0&&words[j-1].equalsIgnoreCase(words[j])==true) continue;
                  System.out.println(words[j]);
              }
          }
      }

    }
}