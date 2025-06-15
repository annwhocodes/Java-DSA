class Solution {
    public boolean isSameAfterReversals(int num) {
        if(SecondReversal(num)==num){
            return true;
        }
        else{
            return false;
        }
    }
    public static int FirstReversal(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        return rev;
    }
    public static int SecondReversal(int n){
        int rev = FirstReversal(n);
        int newNum = 0;
        while(rev>0){
            int rem = rev % 10;
            newNum = newNum * 10 + rem;
            rev = rev/10;
        }
        return newNum;
    }
}