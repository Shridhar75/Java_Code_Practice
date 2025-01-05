package Today_16Nov;
//Java Program to Illustrate use of Binary Literals
public class Binary_Literal {
    public static void main(String[] args)
    {
        byte aB = 0b00100001;
        short aS = 0b10100010100;
        int a1 = 0b10110;
        int a2 = 0b101;
        int a3 = 0b1011;
        int aI=a2+a3;
        System.out.println("Byte value:"+aB);
        System.out.println("Short value:"+aS);
        System.out.println("Integer value:"+a1);
        System.out.println("Result:"+aI);
    }
}
