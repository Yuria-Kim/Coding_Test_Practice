class Solution {
    public String solution(String my_string) {
        String answer = "";
        char a[] = {'a','e','i','o','u'};
        
        for(int i = 0; i<my_string.length(); i++){
            char j = my_string.charAt(i);
            boolean isVowel = false;
            for(int k = 0; k<a.length; k++) {
            	if(j == a[k]) {
            		isVowel = true;
            	}
            }
            if (!isVowel) {
            	answer = answer.concat(Character.toString(j));
            }
        }    
        return answer;
    }
}