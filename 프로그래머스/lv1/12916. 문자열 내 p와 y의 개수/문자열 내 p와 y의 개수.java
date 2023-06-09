class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        String arr[] = s.split("");
        int cnt = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals("P")){
                cnt++;
            }
            else if(arr[i].equals("Y")){
                cnt--;
            }
        }
        answer = (cnt == 0)?true:false;

        return answer;
    }
}