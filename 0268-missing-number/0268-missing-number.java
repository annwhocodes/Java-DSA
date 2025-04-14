class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int new_sum = 0;
        for(int i : nums){
            new_sum+=i;
        }
        int diff = sum - new_sum;
    return diff;
    }
    
}