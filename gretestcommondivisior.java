import java.util.*;
public class gretestcommondivisior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2= sc.nextInt();

        while(n1 != n2){
            if(n1>n2){
                n1=n1-n1;
            }else{
                n2=n2-n1;
            }

        }
        System.out.println("Greatest Common Divisor"+n2);
        sc.close();
        
    }
    
}
