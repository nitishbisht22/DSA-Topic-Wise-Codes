public class PeakIndex2 {
    public static void main(String[] args) {
        int[] arr = {0,1,3,4,2,1};

        int ans = peakIndexbinarySearch(arr, 2);
        int ans1 = peakIndexrightSearch(arr , 2);
        if(peakIndex(arr) < 0)
        {
            System.out.println(ans1);
        }
        else {
            int result = Math.min(ans , ans1);
            System.out.println(result);
        }


        System.out.println(ans);
    }
    public static int peakIndex(int[] arr)
    {
        int start = 0 ;
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
    public static int peakIndexbinarySearch(int[] arr , int target)
    {
        int start = 0;
        int end = peakIndex(arr);

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if(target < arr[mid])
            {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static int peakIndexrightSearch(int[] arr , int target) {
        int start = peakIndex(arr);
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
