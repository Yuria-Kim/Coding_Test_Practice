import java.util.*;
public class Main {
    public static void main(String args[]) {
        //A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int multi = a*b*c;
        String multi_str = String.valueOf(multi);
        //System.out.println(multi_str);
        int count[] = new int[10];
        for(int i = 0; i<multi_str.length(); i++){
            char temp = multi_str.charAt(i);
            int temp1 = Character.getNumericValue(temp);
            count[temp1]++;
        }
        for(int j=0; j<count.length; j++){
            System.out.println(count[j]);
        }
    }
}