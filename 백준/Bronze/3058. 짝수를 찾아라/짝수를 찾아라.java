import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j<t; j++){
            int num [] = new int[7];
            int sum = 0;
            int min = Integer.MAX_VALUE;
            
            for (int i = 0; i<num.length; i++){
                num[i]= sc.nextInt();
                if(num[i]%2==0){
                    sum+= num[i];
                    if(num[i]<min){
                        min = num[i];
                    }
                }
            }
            System.out.printf("%d %d\n", sum, min);
        }
        
    }
}