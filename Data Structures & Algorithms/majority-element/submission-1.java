class Solution {
    public int majorityElement(int[] nums) {
        int num=nums[0];
        int occ=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=num && occ>1){
                occ--;
            }
            else if(occ==1 && nums[i]!=num){
                num=nums[i];
            }
            else{
                occ++;
            }
        }return num;
    }
}