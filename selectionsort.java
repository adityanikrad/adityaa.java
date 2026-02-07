import java.util.Scanner;

public class selectionsort {
    public static void printarray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter "+size+" element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
         
        for(int i=0; i<arr.length-1; i++) {
           int smallest = i;
           for(int j=i+1; j<arr.length; j++) {
               if(arr[j] < arr[smallest]) {
                   smallest = j;


                }
            }
           int temp = arr[smallest];
           arr[smallest] = arr[i];
           arr[i] = temp;
        }
        System.out.println("sorted array:");
        printarray(arr);
        sc.close();

        

    }
    
}
