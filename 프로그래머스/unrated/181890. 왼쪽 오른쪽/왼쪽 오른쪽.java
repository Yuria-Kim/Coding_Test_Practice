import java.util.Arrays;

class Solution {
    public String[] solution(String[] str) {
        String temps = "";

        for (int i = 0; i < str.length; i++) {
            temps += str[i];
        }
        int l = temps.indexOf("l");
        int r = temps.indexOf("r");

        if (l == -1 && r == -1) {
            return new String[0]; // 빈 배열 반환
        } else if (l != -1 && (r == -1 || l < r)) {
            return Arrays.copyOfRange(str, 0, l);
        } else if (r != -1 && (l == -1 || r < l)) {
            return Arrays.copyOfRange(str, r + 1, str.length);
        }

        return null; // 기본적으로 null 반환
    }
}
