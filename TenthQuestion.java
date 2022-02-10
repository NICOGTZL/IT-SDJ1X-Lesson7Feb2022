//Exercise 1.10 What will the following program print? Try to figure it out yourself before
//running the program.
// public class Expressions
// {
// public static void main(String[] args)
//{
//System.out.println(23 * 4.5 / 0.5 + 1); 208?
// System.out.println(23 * 4.5 / (0.5 + 1)); 69?
//System.out.println(2 + 5 - 18 + 11); 0?
//System.out.println((2 + 5) - (18 + 11)); -22?


//System.out.println(14 * 18 / 4 + 4); 31.5? INCORRECT (67)
//System.out.println(14 * 18 / (4 + 4)); 252? INCORRECT (31)
//}
// }

public class TenthQuestion {
    public static void main(String[] args){
        System.out.println(23 * 4.5 / 0.5 + 1);
        System.out.println(23 * 4.5 / (0.5 + 1));
        System.out.println(2 + 5 - 18 + 11);
        System.out.println((2 + 5) - (18 + 11));
        System.out.println(14 * 18 / 4 + 4);
        System.out.println(14 * 18 / (4 + 4));
    }
}
