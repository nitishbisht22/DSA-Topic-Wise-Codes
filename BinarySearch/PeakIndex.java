public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {0, 10 , 15, 17, 5 , 2};
        System.out.println(peakIndex(arr));
    }
    public static int peakIndex(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1])
            {
                start = mid + 1;
            }
            else if(arr[mid] < arr[mid - 1])
                {
                    end = mid - 1;
                }
            else {
                return mid;
            }
        }
        return -1;
    }
}
