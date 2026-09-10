class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = 0;

        for(int num:nums){
            sum1+=num;
        }
        int n=nums.length;
        int sum2 = n*(n+1)/2;
        return sum2-sum1;
    }
}