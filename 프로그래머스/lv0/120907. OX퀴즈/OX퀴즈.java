class Solution {
    public String[] solution(String[] quiz) {
        String answer [] = new String[quiz.length];
		for(int i = 0 ; i<quiz.length; i++) {
			String temp [] = quiz[i].split(" ");
			if (temp[1].equals("+")){
				int result = Integer.valueOf(temp[0])+Integer.valueOf(temp[2]);
				answer[i] = (result == Integer.valueOf(temp[4]))?"O":"X";
			}
			else if (temp[1].equals("-")){
				int result = Integer.valueOf(temp[0])-Integer.valueOf(temp[2]);
				answer[i] = (result == Integer.valueOf(temp[4]))?"O":"X";
			}
			
		}
        return answer;
    }
}