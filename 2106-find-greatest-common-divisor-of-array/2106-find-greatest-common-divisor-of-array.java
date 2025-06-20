class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int min = nums[0];
        int result = 0;
        for(int i = 1; i<=min;i++){
            if(max%i==0 && min%i==0){
                result = i;
            }
        }
        return result;

    }
}