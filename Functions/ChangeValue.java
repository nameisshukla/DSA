package Functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1, 2, 3, 45, 6};
        change(arr); // reference is passed to this parameter,actually the reference itself is passed by call by value because the value that is being passed refers to the object.
        System.out.println(Arrays.toString(arr));
// In Java we don't have Call by Reference we have only call by value

    }

    static void change(int[] nums) {
        nums[0] = 99; // if you make a change to the object  via this ref variable, same object will be changed.   }
    }
}
