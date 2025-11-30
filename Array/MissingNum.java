package Array;
// https://leetcode.com/problems/missing-number/
// Amazon Question
class MissingNum {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
       int missing =  missingNumber(nums);
        System.out.println(missing);
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }

        // search for first missing number
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index) {
                return index;
            }
        }

        // Case 2 
        return nums.length;


    }

     static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}