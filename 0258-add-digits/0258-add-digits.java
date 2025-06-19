class Solution {
    public int addDigits(int num) {
        int Finalsum = addTillOne(num);
        while(Finalsum>=10){
            Finalsum = addTillOne(Finalsum);
        }
        return Finalsum;
    }
    public int addTillOne(int num){
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum = sum+rem;
            num=num/10;
        }
        return sum;
    }
}