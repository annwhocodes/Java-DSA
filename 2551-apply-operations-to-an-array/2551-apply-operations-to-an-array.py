class Solution(object):
    def applyOperations(self, nums):
        n = len(nums)
    
    # Step 1: Apply operations sequentially
        for i in range(n - 1):
            if nums[i] == nums[i + 1]:  
                nums[i] *= 2  
                nums[i + 1] = 0  
    
    # Step 2: Shift non-zero elements to the left
        result = [num for num in nums if num != 0]  # Extract non-zero elements
        result.extend([0] * (n - len(result)))  # Append zeros to the end
    
        return result
