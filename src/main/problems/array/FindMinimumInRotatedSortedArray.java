package main.problems.array;

public class FindMinimumInRotatedSortedArray {
    
    /**
     * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. 
     * For example, the array nums = [0,1,2,4,5,6,7] might become:
     *  - [4,5,6,7,0,1,2] if it was rotated 4 times.
     *  - [0,1,2,4,5,6,7] if it was rotated 7 times.
     * 
     * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
     * 
     * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
     * 
     * You must write an algorithm that runs in O(log n) time.
     * 
     * Ex. 1
     * Input: nums = [3,4,5,1,2]
     * Output: 1
     * Explanation: The original array was [1,2,3,4,5] rotated 3 times.
     * 
     * Ex. 2
     * Input: nums = [4,5,6,7,0,1,2]
     * Output: 0
     * Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
     * 
     * Ex. 3
     * Input: nums = [11,13,15,17]
     * Output: 11
     * Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 
     * 
     * @param arr
     * @return
     */
    public static int returnMinIndexInRotatedSortedArray(int[] arr) {
        if (arr[0] < arr[arr.length - 1]) {
            return 0;
        }
        
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < arr[mid - 1]) {
                return mid;
            }

            if ((arr[mid] > arr[mid + 1])) {
                return mid + 1;
            }


            if (arr[l] < arr[mid]) {
                l = mid;
            } else {
                r = mid;
            }
        }

        return l;
    }

    public static void main(String[] args) {
        int[] test1 = {3,4,5,1,2};
        int[] test2 = {4,5,6,7,0,1,2};
        int[] test3 = {11,13,15,17};

        System.out.println(test1[returnMinIndexInRotatedSortedArray(test1)]);
        System.out.println(test2[returnMinIndexInRotatedSortedArray(test2)]);
        System.out.println(test3[returnMinIndexInRotatedSortedArray(test3)]);
    }
}
