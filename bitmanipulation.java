import java.util.*;
public class bitmanipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oper = sc.nextInt();
        //oper is 1 or 0
        int n = 5;
        int pos = 1;

        int bitMask = 1<<pos;
        if(oper ==1){
            //set operation
            int newNumber=bitMask | n;
            System.out.println(newNumber);
        }else{
            //clear operation
            int newbitMask = ~(bitMask);
            int newNumber = newbitMask & n;
            System.out.println(newNumber);
        }
        sc.close();


        

    }
    
}
