import java.util.Scanner;

public class Problem_1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int Perimeter;
        System.out.print("Please enter 3 sides of a triangle: ");
        // User inputs for sides of the triangle
        int first_side = input.nextInt();
        int second_side = input.nextInt();
        int third_side = input.nextInt();
        // Checking whether sum of 2 sides is greater than the other side
        if (first_side < second_side+third_side && second_side < first_side+third_side && third_side < first_side+second_side)
        {
            //System.out.println("Triangle is legal");
            Perimeter = first_side + second_side + third_side;
            System.out.println("The Perimeter is " + Perimeter);
        }
        // If the "if" condition fails, then the program prints the output saying that the triangle is illegal
        else
        {
            System.out.println("The sides " +first_side +" " +second_side +" "+third_side + " make an illegal triangle.");
        }
    }
}