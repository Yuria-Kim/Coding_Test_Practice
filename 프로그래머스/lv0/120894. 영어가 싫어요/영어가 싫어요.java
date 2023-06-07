import java.util.*;

class Solution {
    public long solution(String numbers) {
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("zero", 0);
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);

        StringBuilder sb = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < numbers.length(); i++) {
            char currentChar = numbers.charAt(i);
            
                currentWord.append(currentChar);
                String word = currentWord.toString();
                if (numberMap.containsKey(word)) {
                    sb.append(numberMap.get(word));
                    currentWord.setLength(0);
                }            
        }
        return Long.parseLong(sb.toString());
    }
}
