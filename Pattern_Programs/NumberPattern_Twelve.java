package Today_4Nov;
/* Write a java program to print below patten
1 2 3 4 5 6 7 8 9 10
 2 3 4 5 6 7 8 9 10
  3 4 5 6 7 8 9 10
   4 5 6 7 8 9 10
    5 6 7 8 9 10
     6 7 8 9 10
      7 8 9 10
       8 9 10
        9 10
         10
        9 10
       8 9 10
      7 8 9 10
     6 7 8 9 10
    5 6 7 8 9 10
   4 5 6 7 8 9 10
  3 4 5 6 7 8 9 10
 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10

 */

public class NumberPattern_Twelve {
    public static void main(String[] args)
    {
         int n=10;
         for(int i=1; i<=n; i++)
         {
             for( int j=1; j<i ; j++)
             {
                 System.out.print(" ");
             }
             for(int k=i; k<=n; k++)
             {
                 System.out.print(k+" ");
             }
             System.out.println();
         }
         for(int i=n-1; i>=1;i--)
         {
             for(int j=1; j<i; j++)
             {
                 System.out.print(" ");
             }
             for(int k=i; k<=n; k++)
             {
                 System.out.print(k+" ");
             }
             System.out.println();
         }
    }
}
