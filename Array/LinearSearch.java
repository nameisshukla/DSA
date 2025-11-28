package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int ans = linearSearch2(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop

        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is = target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
// this line will execute if none of the return statements above have executed
// hence  the target not found
        return -1;
    }


    // if we want to print the element itself and not the index

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop

        for (int element : arr) {
            // check for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }
// this line will execute if none of the return statements above have executed
// hence  the target not found
        return Integer.MAX_VALUE;
    }


    //if we want to return the value in true or false

    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run a for loop

        for (int element : arr) {
            // check for element at every index if it is = target
            if (element == target) {
                return true;
            }
        }
// this line will execute if none of the return statements above have executed
// hence  the target not found
        return false;
    }
}
