import java.util.*;
public class sortarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i,j,temp;
        System.out.print("enter number of elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements:");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //sorting logic
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
        System.out.println("array after sorting: ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();


    }
    
    
}
