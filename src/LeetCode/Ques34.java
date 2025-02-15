package LeetCode;

public class Ques34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        int left = binarySearch(nums,target,true);
        int right = binarySearch(nums,target,false);
        result[0] = left;
        result[1] = right;

        return result;
    }

    private int binarySearch(int[] nums,int target,boolean isSearchingLeft){
        int left = 0;
        int right = nums.length-1;
        int idx= -1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(nums[mid]>target){
                right = mid -1;
            }
            else if(nums[mid]<target){
                left = mid + 1;
            }
            else{
                idx = mid;
                if(isSearchingLeft){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
        }

        return idx;
    }

    public static void main(String args[]){
        Ques34 ques34 = new Ques34();
        ques34.searchRange(new int[]{5,7,7,8,8,10},8);
    }
}
