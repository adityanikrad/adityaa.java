public class recursion4 {
    public static void printfactorial(int n,int fact) {
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact *= n;
        printfactorial(n-1, fact);
        
    }
    public static void main(String[] args) {
        printfactorial(5, 1);
        
    }
    
}
