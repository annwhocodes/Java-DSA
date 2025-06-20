class Solution {
    public int diagonalPrime(int[][] nums) {
        int maxprime = 0;
        for(int i = 0;i<nums.length;i++){
            int val1 = nums[i][i];
            int val2 = nums[i][nums.length-i-1];
            if(isPrime(val1)){
                maxprime = Math.max(maxprime,val1);
            }
            if(isPrime(val2)){
                maxprime = Math.max(maxprime,val2);
            }
        }
        return maxprime;
    }
    public boolean isPrime(int n){
        boolean isPrime = true;
        if(n<2) isPrime = false;
        if(n==2) isPrime = true;
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime = false;
            }
        }
        return isPrime;
    }
}