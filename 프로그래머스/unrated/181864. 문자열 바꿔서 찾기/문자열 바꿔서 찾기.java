class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String change = "";
        for(int i = 0; i<myString.length(); i++){
            String temp = myString.substring(i,i+1);
            if(temp.equals("A")){
                change += "B";
            }
            else if(temp.equals("B")){
                change += "A";
            }
            else{
                change += temp;
            }
        }
        answer = (change.contains(pat))?1:0;
        return answer;
    }
}