package recursion;

public class Hello {
    public static void main(String[] args) {
        hello(5);
    }

    //Trust the fn that it will print hello -> recursive leap of faith
    private static void hello(int n) {
        if(n==0)return; //stopping case or base case or initial condition
        hello(n-1); //calling function itself  // this fn call will print n-1 (4) hello, have faith this will print n-1 hello
        //after return call from above fn next line execute and this fn will end
        System.out.println("hello "+n); // this one print the 5th hello and rest by next line
    }
}
