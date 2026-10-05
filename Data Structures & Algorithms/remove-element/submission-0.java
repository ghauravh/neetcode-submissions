class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return nums.length;
        int v=nums.length-1;
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]==val){
                int temp=nums[v];
                nums[v]=nums[j];
                nums[j]=temp;
                v--;
            }

            
        }return v+1;
    }
}