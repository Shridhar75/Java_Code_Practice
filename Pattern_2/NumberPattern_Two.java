package Today_2Nov;
/*
Write a java program to print below pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28
*/
public class NumberPattern_Two {
    public static void main(String[] args) {
        int i , j , k=1;
        for(i=1; i<=7;i++)
        {
            for(j=1;j<i+1;j++)
            {
                //print the value of k
                System.out.print(k++ +" ");
            }
            //Throw the cursore at the next line
            System.out.println();
        }
    }
}
