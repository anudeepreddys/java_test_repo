import java.util.Scanner;

public class Problem_8 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an amount:");
        // user input for number of dollars starting with dollar sign($)
        String x = scan.next();
        // Finding out the index of dot "."
        int index = x.indexOf(".");
        // Printing out the amount of Dollars and Cents
        System.out.println("There are "+x.substring(1,index)+" dollars and "+x.substring(index+1,index+3)+" cents");
    }
}