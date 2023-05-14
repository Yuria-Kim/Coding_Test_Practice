import java.util.*;
class Solution {
    public int[] solution(String my_str) {
        ArrayList<Integer> answer = new ArrayList<>();
		for (int i =0; i<my_str.length(); i++) {
			char c = my_str.charAt(i);
			if (Character.isDigit(c)) {
				int d = Character.getNumericValue(c);
				answer.add(d);
			}
		}
		Collections.sort(answer);
                
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}