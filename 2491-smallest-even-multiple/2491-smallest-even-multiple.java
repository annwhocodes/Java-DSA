class Solution {
    public int smallestEvenMultiple(int n) {
        int result = 0;
        if(n<=150 && n>=1){
            result = (n%2==0)? n : n*2;
        }
    return result;
    }
}