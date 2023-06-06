class Solution {
    public int solution(String str) {
        str = str.replaceAll(" ", ""); // 공백 제거
        
        int sum = 0;
        int sign = 1; // 부호 설정 (1: 양수, -1: 음수)
        int num = 0; // 현재 처리 중인 숫자
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); // 숫자인 경우 계속해서 자릿수를 늘려감
            } else {
                // 연산자인 경우 이전까지의 숫자를 부호와 함께 더함
                sum += sign * num;
                num = 0; // 숫자 초기화
                
                if (ch == '+') {
                    sign = 1;
                } else if (ch == '-') {
                    sign = -1;
                }
            }
        }
        
        // 마지막 숫자 처리
        sum += sign * num;
        
        return sum;
    }
}
