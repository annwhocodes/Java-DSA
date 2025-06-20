class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        for(int i = 2; i<=a*b;i++){
            if(a%i==0){
                if(b%i==0){
                    count+=1;
                }
            }
        }
        return count+1;
    }
}