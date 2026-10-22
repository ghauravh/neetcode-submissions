class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=nums1.length-1;
        m=m-1;
        n=n-1;
    
        while(n>=0 && m>=0){
            if(nums1[m]>nums2[n]){
                nums1[len]=nums1[m];
                m--;
            }
            else{
                nums1[len]=nums2[n];
                n--;
            }
            len--;
        }
        while(n>=0){
            nums1[n]=nums2[n];
            n--;
        }


        
    }
}