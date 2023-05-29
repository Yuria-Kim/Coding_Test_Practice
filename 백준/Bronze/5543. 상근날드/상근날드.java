import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int burger[] = new int[3];
        int drink[] = new int[2];
        
        for(int i = 0; i<3; i++){
            burger[i] = sc.nextInt();
        }
        for(int i = 0; i<2; i++){
            drink[i] = sc.nextInt();
        }
        
        int set = Integer.MAX_VALUE;
        
        
        for(int i = 0; i<drink.length; i++){
            for(int j =0; j<burger.length; j++){
                int temp = drink[i]+burger[j]-50;
                if(temp < set){
                    set = temp;
                }
            }
        }
    
        System.out.println(set);
    }
}