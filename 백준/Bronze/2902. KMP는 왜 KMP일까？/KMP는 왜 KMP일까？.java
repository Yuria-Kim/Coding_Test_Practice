import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String names = sc.next();
        String n_arr[] = names.split("-");
        String answer = "";
        for (int i = 0; i<n_arr.length; i++){
            String temp = n_arr[i].substring(0,1);
            answer = answer.concat(temp);
        }
        System.out.println(answer);
    }
}