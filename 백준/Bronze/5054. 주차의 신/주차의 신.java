import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //test case
        
        for (int i = 0; i<t; i++){
            int cnt = sc.nextInt(); //store count
            int distance[] = new int[cnt];
            for (int j = 0; j<distance.length; j++){
                distance[j] = sc.nextInt();
            }
            Arrays.sort(distance); //13 24 37 89
            //System.out.println(Arrays.toString(distance));
            
            int total = 0;
            int temp = 0;
            for (int k =1; k<distance.length; k++){
                total += distance[k] - distance[temp];
                temp++;
            }
            total *= 2;
            System.out.println(total);
            //System.out.println();
        }    
    }   
}