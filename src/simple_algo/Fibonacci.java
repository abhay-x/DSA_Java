package simple_algo;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.print(a+" ");
        while(a<20){
            System.out.print(b+" ");
            int c=b;
            b = a + b;
            a= c;
        }
    }
}
