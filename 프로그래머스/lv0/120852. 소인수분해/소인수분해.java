import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        
        Set<Integer> uniqueFactors = new HashSet<>(factors);

        int[] answer = new int[uniqueFactors.size()];
        int index = 0;
        for (int factor : uniqueFactors) {
            answer[index++] = factor;
        }
        Arrays.sort(answer);

        return answer;
    }
}