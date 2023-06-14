class Solution {
    public int solution(int[] common) {
        int answer = 0;
        boolean diff = false;
        //등비인지 등차인지 확인
        //공차 구하기
        //답 찾기
        //일단, 등차로 가정
        int t_arr [] = new int[common.length/2+1];
        int k = 0;
        int temp = common[1]-common[0];
        for(int i = 2; i<common.length; i++){
            k = common[i] - common[i-1];
            if (k==temp){
                diff = true;
                temp = k;
            }
        }
        if(diff==true){
            answer = common[common.length-1]+k;
            return answer;
        }
        else{
            temp = common[1]/common[0];
            answer = common[common.length-1]*temp;
            return answer;
        } 
    }
}