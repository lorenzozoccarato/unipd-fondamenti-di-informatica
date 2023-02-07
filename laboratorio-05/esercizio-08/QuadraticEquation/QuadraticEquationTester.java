import java.util.Scanner;

public class QuadraticEquationTester
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);

       System.out.print("Inserire il coefficiente a: ");
       double a = in.nextDouble();
       System.out.print("Inserire il coefficiente b: ");
       double b = in.nextDouble();
       System.out.print("Inserire il coefficiente c: ");
       double c = in.nextDouble();

       QuadraticEquation eq1 = new QuadraticEquation(a, b, c);

       if(eq1.hasSolutions())
       {
        System.out.println("La prima soluzione è: x1 = " + eq1.getSolution1());
        System.out.println("La seconda soluzione è: x2 = "+ eq1.getSolution2());
       }
       else
        System.out.println("L'equazione non ha soluzioni");
    }
}