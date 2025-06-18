class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        int x = 0;
        while (Math.pow(2, x) <= n) {
            if (n == (int) Math.pow(2, x)) {
                return true;
            }
            x++;
        }
        return false;
    }
}
