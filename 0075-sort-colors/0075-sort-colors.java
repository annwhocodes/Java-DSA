class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int num : nums){
            if(num==0) count0++;
            else if(num ==1) count1++;
            else count2++;
        }

        int i = 0;
        for(int x = 0; x<count0; x++){
            nums[i++]=0;
        }
        for(int y = 0; y<count1; y++){
            nums[i++]=1;
        }
        for(int z = 0; z<count2; z++){
            nums[i++]=2;
        }
    }
}