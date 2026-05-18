public class arraytostring {
    public static void main(String[] args) {
        char ch[]={'h','e','l','l','o'};
        String str=new String(ch);
        System.out.println("character array");
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
        System.out.println("converted string:"+str);
    }

    
}