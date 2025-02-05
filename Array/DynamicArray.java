package Today_7Dec;

//**Java Program to implement Dynamic Array  **/
import java.util.Scanner;
import java.util.ArrayList;

/** class DynamicArray */
class DynamicArray
{
    private ArrayList<String> al;

    /** constructor **/
    public DynamicArray()
    {
        al = new ArrayList<String>();
    }
    /** function to clear **/
    public void clear()
    {
        al.clear();
    }
    /** function to get size **/
    public int size()
    {
        return al.size();
    }
    /** function to insert element **/
    public void insert(String key)
    {
        al.add(key);
    }
    /** function to get element at index **/
    public String get(int index)
    {
        if (index >= al.size())
            return "";
        return al.get(index);
    }
    /** function to remove element at index **/
    public void remove(int index)
    {
        if (index >= al.size())
            return ;
        al.remove(index);
    }
    /** function to remove element **/
    public void remove(String key)
    {
        al.remove(key);
    }
    /** function to display array **/
    public void display()
    {
        System.out.println("\nDynamic Array : "+ al);
        System.out.println();
    }
}

/** Class DynamicArrayTest **/
class DynamicArrayTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dynamic Array Test\n");

        DynamicArray da = new DynamicArray();

        char ch;
        /*  Perform Dynamic Array operations */
        do
        {
            System.out.println("\nDynamic Array\n");
            System.out.println("1. insert ");
            System.out.println("2. remove by index");
            System.out.println("3. remove by val");
            System.out.println("4. clear");
            System.out.println("5. size");
            System.out.println("Enter your choice:");

            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter value to insert");
                    da.insert(scan.next() );
                    break;
                case 2 :
                    System.out.println("Enter index");
                    da.remove(scan.nextInt() );
                    break;
                case 3 :
                    System.out.println("Enter value");
                    da.remove(scan.next() );
                    break;
                case 4 :
                    System.out.println("\nDynamic Array Cleared");
                    da.clear();
                    break;
                case 5 :
                    System.out.println("\nSize = "+ da.size() );
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            da.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
/*
A dynamic array, also known as a ArrayList in Java, is an data structure that can grow or shrink in size
 dynamically as elements are added or removed.
  Dynamic arrays allow for changing the size of the array based on the number of elements
  it contains, while static arrays have a fixed size that cannot be modified.
  Dynamic arrays in Java are implemented using the ArrayList class, which provides methods to
   add, remove, and modify elements in the array. The ArrayList class also automatically handles
   resizing of the array as needed.
 */