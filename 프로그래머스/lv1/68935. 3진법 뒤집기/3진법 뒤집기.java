class Solution {
    public int solution(int n) {
        //1. 3진수로 변환
        String n3 = Integer.toString(n, 3);
        //2. 배열로 바꿔 역순 문자열 생성
        String [] n_arr = n3.split("");
        String n33 = "";
        for(int i = n_arr.length-1; i>=0; i--) {
        	n33 += n_arr[i];
        }
        //3. 10진수로 변환
        int answer = Integer.parseInt(n33, 3);
        return answer;
    }
}