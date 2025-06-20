class Solution {
    public boolean isThree(int n) {
        boolean isThree = false;
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(int i=2; i<=n;i++){
            if(n%i==0){
                factors.add(i);
            }
        }
        if(factors.size()==2){
            isThree = true;
        }
    return isThree;
    }
}