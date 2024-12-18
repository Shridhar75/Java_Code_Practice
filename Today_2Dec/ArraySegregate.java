package Today_2Dec;
//Java Program to Segregate 0s and 1s in an Array
public class ArraySegregate
{
    public static void main(String... a)
    {
        int array[] = { 0, 1, 0, 1, 1, 0 };
        segregate0and1(array, 6);
        for(int i = 0 ; i < 6; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
    static void segregate0and1(int array[], int size)
    {
        int left = 0, right = size-1;
        while (left < right)
        {
            /* Increment left index while we see 0 at left */
            while (array[left] == 0 && left < right)
                left++;
            /* Decrement right index while we see 1 at right */
            while (array[right] == 1 && left < right)
                right--;
            /* If left is smaller than right then there is a 1 at left and a 0 at right.  Exchange it */
            if (left < right)
            {
                array[left] = 0;
                array[right] = 1;
                left++;
                right--;
            }
        }
    }
}