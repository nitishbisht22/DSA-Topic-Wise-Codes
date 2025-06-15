import java.util.Arrays;

public class endStart {
    public static void main(String[] args) {
        int[] arr = {1};
        int ans1 = leftElement(arr, 0);
        int ans2 = rightElement(arr , 0);
        int[] newAns = {ans1 , ans2};
        System.out.println(Arrays.toString(newAns));
    }

    public static int leftElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(arr.length == 0)
        {
            return -1;
        }
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                result = mid;
                end = mid - 1;
            }
        }
        return result;
    }

    public static int rightElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(arr.length == 0)
        {
            return -1;
        }
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }
        return result;
    }
}