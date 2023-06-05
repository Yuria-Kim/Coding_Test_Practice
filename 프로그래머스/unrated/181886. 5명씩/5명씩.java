class Solution {
    public String[] solution(String[] names) {
        int count = (names.length%5==0)?names.length/5:names.length/5+1;
		if(names.length==5) {
			String an[] = {names[0]};
		}
		String an[] = new String[count];
		int temp = 0;
		for(int i = 0; i<an.length; i++) {
			if(temp >= names.length) break;
			an[i] = names[temp];
			temp +=5;
		}
        return an;
    }
}