import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (containsOnly05(i)) {
                answerList.add(i);
            }
        }
        if (answerList.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(answerList);

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    private boolean containsOnly05(int number) {
        String str = String.valueOf(number);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '0' && ch != '5') {
                return false;
            }
        }
        return true;
    }
}