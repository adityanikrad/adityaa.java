import java.util.*;
public class checksortedarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        boolean isassending=true;

        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                isassending=false;
            }

        }
        if(isassending){
            System.out.println("the array is sorted in assending order");

        }else{
            System.out.println("the array is not sorted in assending order");
        }

        sc.close();
        

    }
    
}
