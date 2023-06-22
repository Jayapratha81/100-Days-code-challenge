//sum combination of three numbers

import java.util.Scanner;

public class SumCombinations 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        int sum1 = a + b;
        int sum2 = a + c;
        int sum3 = b + c;
      
        System.out.println("Sum combinations of three numbers:");

        System.out.println("\n"+sum1+"\n"+sum2+"\n"+sum3);
    }
}

