class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
		int index = 0;
        for(int i = 0; i<picture.length; i++){
        	for(int a = 0; a<k; a++) {
	            char [] temp = picture[i].toCharArray();//[1,0,1]
	            String result = "";
	            for(int j = 0; j<temp.length; j++) {
	            	
	            	for(int cnt = 0; cnt<k; cnt++) {
	            		result += temp[j];
	            	}
	            	//System.out.println(result);
	            	
	            }
	            answer[index] = result;
	        	index++;
	            //System.out.println(result);
        	}
        }
        return answer;
    }
}