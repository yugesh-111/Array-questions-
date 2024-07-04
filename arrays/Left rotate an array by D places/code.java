class Solution {
    public void rotate(int[] nums, int k) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){

            arr[(i+k)%nums.length]=nums[i];
            // System.out.print((i+k)%nums.length+" ");
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}