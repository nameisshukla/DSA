package Functions;

public class Scope {
    public static void main(String[]args) {
        int a = 10;
        int b = 20;

        {
//            int a = 78;
            // already initialised outside the block in the same method hence you cannot initialise it again
            a = 100; // reassign the original ref variable to some other value
            System.out.println(a);
            int c  = 99;
            // values intialised in this block wil remain in this block
        }
        System.out.println(a);
//        System.out.println(c); //cannot used outside the block
    }



}
