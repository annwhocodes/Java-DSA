class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        if(num<=1){ 
            return false;
        }
        else{
        for(int i = 2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                if(i*i==num){
                    sum+=i;
                }
                else{
                    sum=(sum+i)+(num/i);
                }
            }
        }
        return sum==num; 
        }
    }
}

