public class charInsert {
    public static void main(String[] args) {
        char[] letters = {'c' , 'c' , 'c' , 'c' , 'c' , 'c' , 'c' , 'n', 'n' , 'n' };
        char ans = isletters(letters , 'c');
        System.out.println(ans);

    }
    static char isletters(char[] letters , char target)
    {
        int start = 0 ;
        int end = letters.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(target < letters[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return letters[start % letters.length] ;
    }
}
