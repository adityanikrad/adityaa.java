import java.util.*;
public class practical1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("choose an operation");
        System.out.println("1.even or odd");
        System.out.println("2.fibonacci series");
        System.out.println("3.simple interest");
        System.out.println("4.maximum of 3 numbers");
        System.out.println("choose your operation:");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("enter a number");
                int num = sc.nextInt();
                if(num%2==0)
                    System.out.println("the number is even");
                else 
                    System.out.println("the number is odd");
                break;
            
            case 2:
                System.out.println("enter the numbers of terms: ");
                int n = sc.nextInt();
                int a=0,b=1;
                System.out.println("fibonacci series:");
                for(int i=1;i<=n;i++){
                    System.out.println(a+" ");
                    int next = a+b;
                    a = b;
                    b = next;
                }
                break;
            case 3:
                System.out.println("enter principal: ");
                double p = sc.nextDouble();
                System.out.println("enter rate: ");
                double r = sc.nextDouble();
                System.out.println("enter a time");
                double t = sc.nextDouble();
                double si = (p*r*t)/100;
                System.out.println("simple interest = "+si);
                break;
            
            case 4:
                System.out.println("enter first number: ");
                int x = sc.nextInt();
                System.out.println("enter a second number: ");
                int y = sc.nextInt();
                System.out.println("enter third number: "); 
                int z = sc.nextInt();
                int max = x;
                if(y>max)
                    max=y;
                if(z>max)
                    max=z;
                System.out.println("maximum number = "+max);
                break;
                
            default:
                System.out.println("invalid choices");

        }
        sc.close();



    }
    
}