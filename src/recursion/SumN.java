package recursion;

public class SumN {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    //return leftPart->(1+2+3+4+5+.....+ (n-1)) + (n) <-rightPart
    private static int sum(int n) {
        if(n==0)return 0;
        return n+sum(n-1);
        //5+sum(4) => 5+4+3+2+1+0
        //  4+sum(3) => 4+3+2+1+0
        //    3+sum(2) => 3+2+1+0
        //      2+sum(1) => 2+1+0
        //        1+sum(0) => 1+0
    }
}
