import java.util.*;
public class exceptionhandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try{
            System.out.println("enter numertor: ");
            int a=sc.nextInt();

            System.out.println("enter denomenater: ");
            int b=sc.nextInt();

            int result=a/b;
            System.out.println("result: "+result);
            
        }
        catch(ArithmeticException e){
            System.out.println("number cant be divide by zaro");
            System.out.println("invalid input");
        }
        finally{
            System.out.println("execution completed");
        }
        sc.close();
    }
    
}
