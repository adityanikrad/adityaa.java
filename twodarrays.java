import java.util.*;
public class twodarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int coloum = sc.nextInt();
        
        int [] [] numbers = new int [row] [coloum];

        for(int i=0;i<row;i++){
            for(int j=0;j<coloum;j++){
                numbers [i] [j] = sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<coloum;j++){
                System.out.println(numbers [i] [j]+" ");
            }
        }
        //finding element in a array
        int x = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<coloum;j++){
                if(numbers[i][j]==x){
                    System.out.println("x found at location ( " + i + ", " + j + ")");

                }

            }

        }
        sc.close();

    }

    
}
 