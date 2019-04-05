package lyambda;

import java.util.Scanner;
public class Lyambda {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        double n=sc.nextDouble();
        System.out.println("Целые делители числа "+(int)n+": ");
Block sum=value->{
    for(int i = 1; i<=value;i++)
        if(value%i==0)
            System.out.println(i);
            return 0;
};
    sum.Result((int)n);
     OneParam del=value-> value/10;
     System.out.println("Десятичная дробь от "+n+": "+del.Result(n));
     TwoParam step=(value, value2) -> Math.pow(value, value2);
          System.out.println("Квадрат числа "+n+": "+step.Result(n,2.0));
}
    }
    

