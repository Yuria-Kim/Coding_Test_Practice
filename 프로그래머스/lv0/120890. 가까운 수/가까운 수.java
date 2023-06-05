class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int diff = Math.abs(n - array[i]);
            if (diff < minDiff) {
                minDiff = diff;
                answer = array[i];
            } else if (diff == minDiff) {
                answer = Math.min(answer, array[i]);
            }
        }

        return answer;
    }
}
