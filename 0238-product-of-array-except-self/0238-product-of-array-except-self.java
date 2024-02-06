class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] res = new int[nums.length];
        
        int prefix = 1;
        for(int i=0;i<nums.length;i++){ //forward direction
            res[i] = prefix;
            prefix*=nums[i];
        }
        int postfix=1;
        for(int i=nums.length-1;i>=0;i--){ // reverse direction
            res[i]*=postfix;
            postfix*=nums[i];
        }
        return res;
    }
}