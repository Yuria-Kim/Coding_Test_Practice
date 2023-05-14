class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for(int i = 0; i<box.length; i++){
            int a = box[i]/n;
            answer *= a;
        }
        return answer;
    }
}