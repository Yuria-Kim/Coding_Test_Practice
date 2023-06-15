class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);

                if (j % 2 == 0) {
                    answer.append(Character.toUpperCase(ch));
                } else {
                    answer.append(Character.toLowerCase(ch));
                }
            }

            if (i != words.length - 1) {
                answer.append(" ");
            }
        }

        int lastIdx = s.length() - 1;
        while (lastIdx >= 0 && s.charAt(lastIdx) == ' ') {
            answer.append(" ");
            lastIdx--;
        }

        return answer.toString();
    }
}
