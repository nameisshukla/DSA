package Functions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = add2(20,30);
        System.out.println(sum);
    }


    //pass the value of number when you are calling the method in main()
    static int add2(int a, int b) {
        int sum  = a + b;
        return sum;

    }










    //return the value
    static int add1() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = in.nextInt();
        System.out.println("enter the value of b");
        int b = in.nextInt();
        int ans = a + b;
        System.out.println("The Sum =" + ans);
        return ans;
    }

    static void add() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = in.nextInt();
        System.out.println("enter the value of b");
        int b = in.nextInt();
        int ans = a + b;
        System.out.println("The Sum =" + ans);
    }
}
