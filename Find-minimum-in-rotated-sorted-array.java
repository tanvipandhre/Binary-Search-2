class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;

        while(low<=high){

            //if both are sorted array
            if(nums[low]<=nums[high])
                return nums[low];
            int mid = low + (high-low)/2;
            if(mid > 0 && nums[mid] < nums[mid-1]) //base condition comparison like nums[mid] & target
                return nums[mid];
                //left sorted array
            else if(nums[low]<=nums[mid]){
                low = mid + 1;
            }
            //right sorted array
            else{
                high = mid - 1;
            }
        }
        return 89988;
    }
}