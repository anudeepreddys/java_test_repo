import java.util.Scanner;

public class Problem_5 {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int mid,x1,x2,x3,first,last;
        System.out.println("Please enter three integers: ");
        // User entry of 3 numbers
        x1 = s.nextInt();
        x2 = s.nextInt();
        x3 = s.nextInt();
        last = x1;
        first = x2;
        if(x2>last || x3>last)
        {
            if(x2>x3)
                last = x2;
            else
                last = x3;
        }
        if(x1<first || x3<first)
        {
            if(x1<x3)
                first = x1;
            else
                first = x3;
        }
        // finding the middle number from first and last number
        mid = x1 + x2 + x3 - first - last;
        // Printing the numbers in order
        System.out.println("The numbers in order are: "+first+ " "+mid+" "+last);
    }
}