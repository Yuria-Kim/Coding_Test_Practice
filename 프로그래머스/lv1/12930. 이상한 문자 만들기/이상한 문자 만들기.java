class Solution {
  public String solution(String s) {
      String answer = "";

      char[] arr_s = s.toCharArray();

      int num=0;
      for(int i=0; i<arr_s.length; i++){
          // System.out.println(arr_s);

          if(arr_s[i]==' ') {
              num=0;
              continue;
          }
          if( num%2==0 && ('a'<=arr_s[i] && arr_s[i]<='z')  ){
                  arr_s[i]-=32;
          }
          else if( num%2==1 && ('A'<=arr_s[i] && arr_s[i]<='Z' )){
              arr_s[i]+=32;
          }
          num++;
      }

      return String.valueOf(arr_s);
  }
}