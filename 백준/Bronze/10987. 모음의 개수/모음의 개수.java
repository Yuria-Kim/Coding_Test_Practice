import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String compare [] = {"a","e","i","o","u"};
        int cnt = 0;
        for(int i = 0; i < word.length(); i++) {
            for(int j = 0; j < compare.length; j++) {
                if(word.substring(i, i+1).equals(compare[j])) { // 문자열을 하나씩 비교
                    cnt++;
                    break; // 모음을 찾았으면 반복문 종료
                }
            }
        }
        System.out.println(cnt);
    }
}