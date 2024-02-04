// Using HashMap
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int [] res = new int[2];
        
//         for(int i=0;i<nums.length;i++){
//             if(map.containsKey(nums[i])){
//                 res[0]=map.get(nums[i]);
//                 res[1]=i;
//             }
//             else{
//                 map.put(target-nums[i],i);
//             }
//         }
//         return res;
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum = target-nums[i];
                if(nums[j]==sum){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }

 }