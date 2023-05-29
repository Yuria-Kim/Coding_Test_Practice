import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i<t; i++){
            int cnt = sc.nextInt();//학생수
            int score [] = new int[cnt]; //점수 배열
            
            for(int j = 0; j<score.length; j++){
                score[j] = sc.nextInt();
            }
            
            // 최소점, 최대점, 두값차이
            Arrays.sort(score);
            int min = score[0];
            int max = score[cnt-1];
            int gap = 0;
            int k = 1;
            for (int c = 0; c<score.length; c++){
                if(k>=score.length) break;
                int temp = score[k]-score[c];
                k++;
                if(temp>gap) gap = temp;
            }
            System.out.printf("Class %d\n", i+1);
            System.out.printf("Max %d, Min %d, Largest gap %d\n", max, min, gap);
        }
    }
}