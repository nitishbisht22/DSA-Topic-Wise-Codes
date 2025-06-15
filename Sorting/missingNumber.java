import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {9 , 6 , 4 , 2 , 3 , 5 , 7 , 0 , 1};
        System.out.println(missing(arr));

    }
    static int missing(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex])
            {
                swap(arr , i , correctIndex);
            }
            else {
                i++;
            }
        }

        for(int index = 0 ; index < arr.length ; index++)
        {
            if(arr[index] != index)
            {
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr , int first , int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
