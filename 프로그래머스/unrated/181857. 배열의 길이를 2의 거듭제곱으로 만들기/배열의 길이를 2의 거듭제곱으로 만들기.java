class Solution {
    public int[] solution(int[] arr) {
        int cnt = 1;
        while (cnt < arr.length) {
            cnt *= 2;
        }
        int[] answer = new int[cnt];
        for(int i = 0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}