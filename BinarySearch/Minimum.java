import java.util.Arrays;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = {11,13,15,17};
        int ans = minimum(arr);
        System.out.println(ans);
    }
    public static int minimum(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[end])
            {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return arr[start];
    }
}
