//Exercise 1.07 Determine the order of evaluation of the operators in each of the following
//Java statements, and try to figure out what the value of x, y, and z will be.
//Then check if you were right by implementing a Java program that prints
//out the values after running the statements.

//a. x = 7 + 3 * 6 / 2 - 1; 15
//b. y = 2 % 2 + 2 * 2 - 2 / 2; 3
//c. z = (3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) ); 324


public class SeventhQuestion {
    public static void main(String[] args){
        int x = 7 + 3 * 6 / 2 - 1;
        System.out.println(x);

        int y = 2 % 2 + 2 * 2 - 2 / 2;
        System.out.println(y);

        int z = (3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) );
        System.out.println(z);
    }

}
