import java.util.*;
class Solution {
    public int solution(int a, int b) {
        // a가 분자, b가 분모
        // 기약분수 = 분모 , 분자의 최대 공약수로 나눈것
        // 소수 = 분자/ 분모 => 이게 끝이 있으면 return 1, or 2
        // 1. a와 b의 최대공약수 구하기
        List<Integer>divisor = new ArrayList<>();
        int i = 1;
        while(true){
            if(i>a || i>b){
                break;
            }
            if(a%i==0 && b%i==0){
                divisor.add(i);
            }
            i++;
        }
        int d = divisor.get(divisor.size()-1);
        // 2. 분모를 최대공약수로 나눠주자
        b /= d;
        // 3. 유한소수는? 분모 b 의 소인수가 2와 5만 존재하는지 확인
        int answer = 2;
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }
        if(b==1) {
        	answer = 1;
        }
        
        return answer;
    }
}