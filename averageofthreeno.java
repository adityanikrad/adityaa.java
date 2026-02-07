
import java.util.*;
public class averageofthreeno {
    public static int avgofthreeno  (int a,int b,int c){
        int avg=a+b+c/3;
        return avg;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

        int avg=avgofthreeno(a,b,c);
        System.out.println("average of three numbers:"+avg);
        sc.close();
    }
       
}
