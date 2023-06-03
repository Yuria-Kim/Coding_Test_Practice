import java.util.*;

class Solution {
    private int count;

    public int solution(int balls, int share) {
        count = 0;
        combination(0, balls, share);
        return count;
    }

    private void combination(int start, int n, int r) {
        if (r == 0) {
            count++;
            return;
        }

        for (int i = start; i <= n - r; i++) {
            combination(i + 1, n, r - 1);
        }
    }
}