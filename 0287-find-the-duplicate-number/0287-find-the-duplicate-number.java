class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] travelled = new boolean[nums.length];
        for(int num : nums){
            if(travelled[num]){
                return num;
            }
            travelled[num] = true;
        }
        return -1;
    }


}