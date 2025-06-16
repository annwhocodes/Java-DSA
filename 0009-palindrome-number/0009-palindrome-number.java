class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev = 0;
        int myNum = x;
        while(Math.abs(x)>0){
            int rem = x%10;
            rev = rev * 10 + rem;
            x = x/10;
        }
        if (myNum == rev){
            return true;
        }
        else{ 
            return false;
        }
    }
}