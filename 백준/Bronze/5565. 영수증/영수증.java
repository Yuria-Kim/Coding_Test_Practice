import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //책 10권의 총 가격과 가격을 읽을 수 있는 9권 가격이 주어졌을 때, 가격을 읽을 수 없는 책의 가격을 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int each [] = new int[9];
        int answer = total;

        for (int i = 0; i<each.length; i++){
            each[i] = sc.nextInt();
            answer -= each[i];
        }
        System.out.println(answer);

    }
}