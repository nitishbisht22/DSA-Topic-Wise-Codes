public class minHard {
    public static void main(String[] args) {
        int[] arr = {2,2,2,0,1};
       int ans =  minimum(arr);
        System.out.println(ans);
    }

    public static int minimum(int[] arr) {
        int start = 0;
        int end = arr.length- 1;

        while(start < end)
        {
            while(start < end && arr[start] == arr[start + 1])
                start++;

            while(start < end && arr[end] == arr[end - 1])
                end--;

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
