//Exercise 1.06 Write a program that calculates and prints the circumference and area of a
//circle with radius 22.5. (Hint: The circumference of a circle is 2πr, the area is
//πr
//2
//. The expression Math.PI gives a value for π).

public class SixthQuestion {
    public static void main(String[] args){
        float circleRadius = (float) 22.5;

        //Using 2πr
        float circumference = (float) (2*Math.PI*circleRadius);
        System.out.println("\nThe circumference of the circle is: " + circumference + " units.\n");

        //Using πr
        float area = (float) (Math.PI*circleRadius);
        System.out.print("The area of the circle is: " + area + " units².\n");

    }

}
