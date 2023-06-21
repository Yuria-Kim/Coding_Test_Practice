class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				answer += " ";
			}
            char temp = (char) (s.charAt(i)+n);
			if (Character.isLowerCase(s.charAt(i))) {
				if(temp > 'z') {
					temp -= 26;
				}
				answer+= temp;
			}
			else if(Character.isUpperCase(s.charAt(i))) {
				if(s.charAt(i)>90-n) {
					temp -= 26;
				}
				if(temp > 'Z') {
					temp -= 26;
				}
				answer += temp;
			}
			else {
				continue;
			}
		}
        return answer;
    }
}