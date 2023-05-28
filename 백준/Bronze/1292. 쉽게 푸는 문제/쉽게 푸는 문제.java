import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[1000];
        
        int count = 1;
        int index = 0;
        
        for (int i = 1; i<=number.length; i++){
            for(int j = 0; j<count; j++){
                if(index == 1000) break;
                number[index] = i;
                index++;
            }count++;
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        
        for(int i = start-1; i<end; i++){
            sum += number[i];
        }
        
        
        System.out.println(sum);
    }   
}