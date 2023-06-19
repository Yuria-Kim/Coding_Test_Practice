class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        //0. A==B일때
        if(A.equals(B)){
            return answer;
        }
        //1. 문자열 밀기
        int cnt = 1;
        while(cnt!=B.length()){
            char arr[] = A.toCharArray();
            String rvstr = String.valueOf(arr[arr.length-1]);
            for(int i = 0; i<arr.length-1; i++){
                rvstr += String.valueOf(arr[i]);
            }
            if(rvstr.equals(B)){
                answer = cnt;
                return answer;
            }
            else{
                A = rvstr;
                cnt++;
            }
        }
        answer = -1;
        //2. 밀린 문자열과 B비교
        //3. 같으면 1반환, 아니라면 cnt++후 반복
        //4. cnt가 i까지 갔는데도, 같지 않다면 -1반환
        return answer;
    }
}