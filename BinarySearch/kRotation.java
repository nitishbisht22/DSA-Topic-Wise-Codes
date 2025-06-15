public class kRotation {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,1,1,1,1,1};
        int ans = rotatedArray(arr);
        boolean left = leftSearch(arr , 13);
        boolean right = rightSearch(arr , 13);
        if(left == false && right == false)
        {
            System.out.println("false");
        }
        else if(left == true)
        {
            System.out.println("true");
        }
        else {
            System.out.println("true");
        }
    }
        public static int rotatedArray(int[] arr){
            int start = 0;
            int end = arr.length -1;
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
             return start;
        }
    public static boolean leftSearch(int[] arr , int target)
    {
        int start = 0;
        int end = rotatedArray(arr) - 1;

        while(start <= end)
        {
            int mid = start + (end - start )/ 2;
            if(arr[mid] > target)
            {
                end = mid - 1 ;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
    public static boolean rightSearch(int[] arr , int target)
    {
        int start = rotatedArray(arr);
        int end = arr.length -1;

        while(start <= end)
        {
            int mid = start + (end - start )/ 2;
            if(arr[mid] > target)
            {
                end = mid - 1 ;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
