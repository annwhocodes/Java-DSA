import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> bannedSet = new HashSet<>();
        for (int num : banned) {
            bannedSet.add(num);
        }

        int currentSum = 0;
        int count = 0;

        for (int num = 1; num <= n; num++) {
            if (!bannedSet.contains(num)) {  
                if (currentSum + num <= maxSum) { 
                    currentSum += num;
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
    }
}
