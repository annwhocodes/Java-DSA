class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr_new = new ArrayList<Boolean>();
        for(int i = 0; i<candies.length ; i++){
            if(candies[i]+extraCandies >= maxEl(candies)){
                arr_new.add(true);
            }
            else {
                arr_new.add(false);
            }
        }
        return arr_new;
    }
    public static int maxEl(int[] arr){
        int maxEl = 0;
        for(int num : arr){
            if(num>maxEl){
                maxEl = num;
            }
        }
        return maxEl;
    }
}