class Solution {
    public int[] solution(int[] arr) {
        int len = 0;
        for(int i = 0; i<arr.length; i++){
            len+=arr[i];
        }
        int[] answer = new int[len];
        
        int temp = 0;
        
        for(int i=0; i<arr.length; i++){
            int value = arr[i];
            
            for (int j = 0; j<value; j++){
                answer[temp] = value;
                temp++;
            }
        }
        return answer;
    }
}