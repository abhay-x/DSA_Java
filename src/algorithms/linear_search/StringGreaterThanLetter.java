package algorithms.linear_search;

public class StringGreaterThanLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','h'}; //array of String
        char target = 'g';
        System.out.println(letters[greater(letters, target)]);
    }

    private static int greater(char[] letters, char target) {
        if (target >= letters[letters.length-1]) {//wrap around if not found greater than element
            return 0;
        }//or return start % letters.length; in last
        int start = 0, end = letters.length-1;
        while (start <= end) {
            int mid = (start + end )/ 2;
            if (target < letters[mid]) {
                end=mid-1;
            }else start=mid+1;
        }
        return start; //or return start % letters.length;
    }
}
