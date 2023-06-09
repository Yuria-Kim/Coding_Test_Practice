class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String arr[] = s.split("");
        int pcnt = 0;
        int ycnt = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals("p")||arr[i].equals("P")){
                pcnt++;
            }
            else if(arr[i].equals("y")||arr[i].equals("Y")){
                ycnt++;
            }
        }
        answer = (pcnt==ycnt)?true:false;

        return answer;
    }
}