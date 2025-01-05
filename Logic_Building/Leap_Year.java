//Program to print year is leap or not
package Today_25Oct;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        System.out.println(" Enter any year:   ");
        Scanner sc = new Scanner(System.in);

         int year = sc.nextInt();
         boolean flag = false;
          if(year % 400 ==0 || year %4==0)
          {
              flag= true;
          }
       else if (year % 100 == 0)
          {
              flag = false;
          }
        if(flag)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
    }
    }
