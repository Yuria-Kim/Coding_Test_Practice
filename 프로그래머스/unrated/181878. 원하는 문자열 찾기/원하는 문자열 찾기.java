class Solution {
    public int solution(String myString, String pat) {
        int len1 = myString.length();
        int len2 = pat.length();

        for (int i = 0; i <= len1 - len2; i++) {
            String substring = myString.substring(i, i + len2);
            if (substring.equalsIgnoreCase(pat)) {
                return 1;
            }
        }
        
        return 0;
    }
}
