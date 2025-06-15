public class rbs {
    public static void main(String[] args) {
        int[] arr = {};
        int ans =search(arr , 10);
        System.out.println(ans);


    }
    public static int findPivot(int[] arr)
    {
            int start = 0;
            int end  = arr.length - 1;
            while(start < end)
            {
                int mid = start + (end - start) / 2;
                if(arr[mid] > arr[end])
                {
                    start = mid + 1;
                }
                else{
                    end = mid;
                }
            }
            return end;
    }
    public static int binarySearch(int start , int end , int[] arr , int target)
    {
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] > target)
            {
                end = mid -1;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static int search(int[] arr , int target)
    {
        int pivot = findPivot(arr);
        int index = binarySearch(0 , pivot - 1 , arr , target);
        if(index != -1)
        {
            return index;
        }
        index = binarySearch(pivot , arr.length - 1 , arr , target);
        return index;
    }
}
