import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int prenumber = sc.nextInt();
        int num[] = new int[(int)(Math.log10(prenumber)+1)];
        int i = 0;
        while(prenumber>0){
            num[i] = prenumber%10;
            prenumber /= 10;
            i++;
        }
        Arrays.sort(num);
        String answer = "";
        for(int j = num.length-1; j>=0; j--){
            String temp = String.valueOf(num[j]);
            answer = answer.concat(temp);
        }
        int result = Integer.valueOf(answer);
        System.out.println(result);
    }
}