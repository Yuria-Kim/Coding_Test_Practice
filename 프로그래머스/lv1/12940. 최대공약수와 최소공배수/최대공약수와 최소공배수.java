class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        //최대 공약수 : 공통의 약수 중 가장 큰값
        //1. 각 수의 약수 구하기
        //n이 m의 약수 일경우 이게 최대 공약수
        //아닐경우 n%i == 0 && m%i==0 i=n i--;
        //1-1. 각각 약 수 중 공통된 가장 큰 수 찾기
        if(n<m){ //n이 작은경우
            if (m%n==0){
                answer[0] = n;
            }
            else{
                for(int i = n-1; i>0; i--){
                    if((n%i==0)&&(m%i==0)){
                        answer[0] = i;
                        break;
                    }
                }
            }
        }
        else{ // m이 작은경우
            if (n%m==0){
                answer[0] = m;
            }
            else{
                for(int i = m-1; i>1; i--){
                    if((n%i==0)&&(m%i==0)){
                        answer[0] = i;
                        break;
                    }
                }
            }
        }
        
        //최소 공배수 : 공통의 배수 중 가장 작은 값
        //2. 각 수의 배수 구하기
        //2-1. 각각의 배수 중 공통된 가장 작은 값 찾기
        //n *= 2 
        answer[1] = n*m/answer[0];
        // if(n<m){
        //     for(int i = n; i>0; i+=n){ //i = 2, 4, 8, 
        //         if(i==m){
        //             answer[1]=i;
        //             break;
        //         }
        //         if(i>m){
        //             m += m;
        //         }
        //     }
        // }
        // else{
        //     for(int i = m; i>0; i+=m){
        //         if(i==n){
        //             answer[1]=i;
        //             break;
        //         }
        //         if(i>n){
        //             n += n;
        //         }
        //     }
        // }
        return answer;
    }
}