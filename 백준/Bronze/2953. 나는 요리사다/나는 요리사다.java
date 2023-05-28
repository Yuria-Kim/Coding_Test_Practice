import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int member [] = new int [5];
        
        for(int i = 0; i<member.length; i++){
            for(int j = 0; j<4; j++){
                member[i] += sc.nextInt();
            }
        }
        int max = member[0];
        int win_index = 0;
        
        for(int k = 1; k<member.length; k++){
            if(max<member[k]){
                max = member[k];
                win_index = k;
            }
        }
        System.out.printf("%d %d", win_index+1, max);
    }
}