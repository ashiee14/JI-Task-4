package task4;

import java.util.Scanner;
class Calculator
{
    //utility methods
    static int add(int a, int b)//addition (int)
    {
        return a + b;
    }

    static double add(double a, double b)//addition(double)[method overloading]
    {
        return a + b;
    }

    static int subtract(int a, int b)//subtraction
    {
        return a - b;
    }

    static int multiply(int a, int b)//multiplication
    {
        return a * b;
    }

    static double divide(int a, int b)//division
    {
        if (b == 0)
        {
            throw new ArithmeticException("Division by zero is not allowed");//exception handling
        }
        return (double) a / b;
    }

    static void changeValue(int x)//pass by value
    {
        x = x + 10;
        System.out.println("Value inside method: " + x);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition (int): " + add(10, 20));//testing utility methods
        System.out.println("Addition (double): " + add(10.5, 5.5));
        System.out.println("Subtraction: " + subtract(30, 10));
        System.out.println("Multiplication: " + multiply(5, 4));
        try 
        { //exception handling test
            System.out.println("Division: " + divide(20, 2));
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        int num = 50;//pass by value test
        System.out.println("Value before method call: " + num);
        changeValue(num);
        System.out.println("Value after method call: " + num);
        sc.close();
    }
}