public class rotatedArray {
    public static void main(String[] args) {
        int[] arr = {5 , 1 , 3};
        System.out.println(findAns(arr));
    }

    public static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if(start == end)
        {
            return start;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static int leftSearch(int[] arr , int target , int ans ){
        int start = 0;
        int end = ans;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if (target < arr[mid])
            {
                end = mid -1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    public static int rightSearch(int[] arr , int target , int ans ){
        int start = ans + 1;
        int end = arr.length -1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if (target < arr[mid])
            {
                end = mid -1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    public static int findAns(int[] arr)
    {
        int ans = pivot(arr);
        int leftAns = leftSearch(arr,5 , ans);
        int rightAns = rightSearch(arr , 5 , ans);
        if(leftAns == -1 && rightAns == -1)
        {
            return -1;
        }
        else if(leftAns == -1)
        {
            return rightAns;
        }
        else {
            return leftAns;
        }
    }
}