class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0; // 시작 mode = 0

        for (int idx = 0; idx < code.length(); idx++) {
            if (mode == 0) {
                if (code.charAt(idx) != '1') {
                    if (idx % 2 == 0) {
                        answer += code.charAt(idx);
                    }
                } else {
                    mode = 1; // mode를 0에서 1로 변경
                }
            } else if (mode == 1) {
                if (code.charAt(idx) != '1') {
                    if (idx % 2 == 1) {
                        answer += code.charAt(idx);
                    }
                } else {
                    mode = 0; // mode를 1에서 0으로 변경
                }
            }
        }

        if (answer.equals("")) {
            answer = "EMPTY"; // 결과 문자열이 비어있을 경우 "EMPTY"로 설정
        }

        return answer;
    }
}