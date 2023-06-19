class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(int i = 0; i<dic.length; i++){
            int cnt = 0;
            for(String w : spell){
                if(dic[i].contains(w)){
                    cnt++;
                }
            }
            if(cnt == spell.length){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}