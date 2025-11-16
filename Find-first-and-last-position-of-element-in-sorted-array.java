class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        if(n==0) return new int[]{-1,-1};
        int first = findFirst(nums, target, low, high);
        int last = findLast(nums, target, low, high);
        return new int[]{first,last};
    }
    private int findFirst(int[] nums, int target, int low, int high){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                if(mid == 0 || nums[mid] > nums[mid-1]) //first occurence
                    return mid;
                else //keep moving left
                    high = mid-1;
            }
            //traverse
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    private int findLast(int[] nums, int target, int low, int high){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                if(mid == nums.length-1 || nums[mid] < nums[mid+1]) //last occurence
                    return mid;
                else //keep moving right
                    low = mid+1;
            }
            //traverse
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

}