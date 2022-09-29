import java.util.Arrays;

public class exam {
    public static void main(String[] args) {
        String s = "123456789";
        StringBuilder s1 = new StringBuilder();
        s1.append(s);
        s1.reverse();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c1 =  s.charAt(i);
            char c2 = s1.charAt(i);
            if (c1==c2) {
                s2.append(c1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            System.out.print(s2.charAt(i)+" ");
        }
    }
}
