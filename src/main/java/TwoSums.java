
public class TwoSums {

    int nums[];
    int target;


    TwoSums(){
        int[] nums = new int[]{};
        target = 0;
    }

    public int[] getTwoSum(int[] array, int temp){
        nums = array;
        target = temp;
        int begin=0;
        int end = array.length-1;
        while(begin<end ){
            if (nums[begin]+nums[end]<target)
                begin++;
            else if (nums[begin]+nums[end]>target)
                end--;
            else {
                return new int[]{nums[begin], nums[end]};
            }
        }
        return new int[]{};
    }
}
