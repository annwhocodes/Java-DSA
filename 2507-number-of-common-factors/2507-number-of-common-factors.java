class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int limit = (Math.min(a,b));
        for(int i = 2; i<=limit;i++){
            if(a%i==0){
                if(b%i==0){
                    count+=1;
                }
            }
        }
        return count+1;
    }
}