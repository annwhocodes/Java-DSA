class Solution {
    public int primePalindrome(int n) {
        if (n <= 11) {
            for (int i = n; i <= 11; i++) {
                if (isPalindrome(i) && isPrime(i)) return i;
            }
        }

        for (int len = 1; len < 6; len++) {
            for (int root = (int) Math.pow(10, len - 1); root < (int) Math.pow(10, len); root++) {
                String s = Integer.toString(root);
                StringBuilder sb = new StringBuilder(s);
                sb.deleteCharAt(sb.length() - 1); 
                String palStr = s + sb.reverse().toString();
                int candidate = Integer.parseInt(palStr);
                if (candidate >= n && isPrime(candidate)) {
                    return candidate;
                }
            }
        }

        return -1; 
    }
    public boolean isPalindrome(int n){
        int myNum = n;
        int rev = 0;
        while(n>0){
                int rem = n %10;
                rev = rev*10 + rem;
                n = n/10;
        }
        return myNum == rev;
    }
    public boolean isPrime(int n){
        boolean isPrime = true;
        if(n<2) return isPrime=false;
        for(int i = 2 ; i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime = false;
            }
        }
        return isPrime;
    }
}