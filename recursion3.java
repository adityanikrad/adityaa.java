public class recursion3 {
    public static void sumofnnumbers(int n,int sum) {
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum += n;
        sumofnnumbers(n-1,sum);
        
    }
    public static void main(String[] args) {
        sumofnnumbers(5, 0);
        
    }
    
}
