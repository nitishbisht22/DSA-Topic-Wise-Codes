public class singleUnique {
    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};
        int ans = uniqueSingle(arr);
        System.out.println(ans);
    }

    public static int uniqueSingle(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;
        int ans1 = 0;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == arr[mid + 1])
            {
                ans = end - (mid + 1);
                if(ans % 2 == 0)
                {
                    end = mid - 1;
                }
                else {
                    start = mid + 2;
                }
            }
            else {
                ans1 = end - mid ;
                if(ans1 % 2 == 0)
                {
                    end = mid;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return arr[start];
    }
}
