
public class TwoSums {

    int nums[];
    int target;


    TwoSums(){
        int[] nums = new int[]{};
        target = 0;
    }

    public int[] getTwoSum(int[] arr, int t){
        nums = arr;
        target = t;
        int start=0;
        int end = arr.length-1;
        while(start<end ){
            if(nums[start]+nums[end]>target)
                end--;
            else if (nums[start]+nums[end]<target)
                start++;
            else {
                return new int[]{nums[start], nums[end]};
            }
        }
        return new int[]{};
    }
}
