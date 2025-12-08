//https://leetcode.com/problems/rotate-array/description/

package Array;

public class RotateArray {
        public static void rotateRight(int[] arr, int k) {
            int n = arr.length;
            k = k % n;  // handle cases where k > n

            // Temporary array to store last k elements
            int[] temp = new int[k];

            // Copy last k elements into temp
            for (int i = 0; i < k; i++) {
                temp[i] = arr[n - k + i];
            }

            // Shift the remaining elements to the right
            for (int i = n - 1; i >= k; i--) {
                arr[i] = arr[i - k];
            }

            // Copy temp elements back to the beginning
            for (int i = 0; i < k; i++) {
                arr[i] = temp[i];
            }
        }

        // Test the code
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;

            rotateRight(arr, k);

            // Print rotated array
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

