class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        //각 자리수의 합 구하기
        //합으로 x%0==0 인지 확인
        String sx_arr [] = String.valueOf(x).split("");
        int sum = 0;
        for(int i = 0; i<sx_arr.length; i++){
            sum += Integer.valueOf(sx_arr[i]);
        }
        answer = (x%sum==0)?true:false;
        return answer;
    }
}