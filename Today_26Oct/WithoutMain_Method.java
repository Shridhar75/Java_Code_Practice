package Today_26Oct;

public class WithoutMain_Method {
        static{
            System.out.println("Output display without main method");
            System.exit(0);
        }
}
/* We put the statement to be printed in a static block.
The static block executes before main method hence we get the desired output.
 But in case of JDK7 the code would not execute as it looks for main method before any other thing.*/