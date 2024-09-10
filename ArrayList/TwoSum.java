package ArrayList;
import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] mountainArr = {5,1,3};
        int target =5;

        System.out.println(Arrays.toString(twoSum(mountainArr,target)));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] positions = new int[2];
        int diff =0;
        for (int i=0; i< nums.length; i++){
            diff = nums[i]-target;

        }

        return positions;
    }
}

