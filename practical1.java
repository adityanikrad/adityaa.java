import java.util.*;

public class practical1 {
    public static int fibonacciseries(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacciseries(n - 1) + fibonacciseries(n - 2);
    }

    

    public static int simpleinterest(int principal, int rate, int time) {
        int SI = (principal * rate * time) / 100;
        System.out.println("the simple interest is: " + SI);
        return SI;

    }

    public static void evenodd(int x) {
        if (x % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }
    }

    public static void maxofthree(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("greater number is a: "+a);
            
        }
         else if (b > a && b > c) {
            System.out.println("greater number is b: "+b);

        } else {
            System.out.println("greater number is c: "+c);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("even odd check:");
        int x = sc.nextInt();
        evenodd(x);

        System.out.println("max of three no check:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        maxofthree(a, b, c);

        System.out.println("simple interest check:");
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        simpleinterest(principal, rate, time);
       

        System.out.println("checkinh fibonacci series");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series up to " + n + " terms (recursive):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciseries(i) + " ");
        }
         sc.close();
    }
}
