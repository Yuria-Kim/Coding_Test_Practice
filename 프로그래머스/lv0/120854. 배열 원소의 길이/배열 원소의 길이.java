class Solution {
    public int[] solution(String[] strlist) {
        String a = "";
        int b = 0;
        int count [] = new int[strlist.length];
        for (int i = 0; i<strlist.length; i++){
            a = strlist[i];
            b = a.length();
            count[i] = b;
        }
        return count;
    }
}