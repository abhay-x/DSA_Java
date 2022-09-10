package data_structure.String;

public class LinearSearch {
    public static void main(String[] args) {
        String name = "Abhay";
        char target = 'B';
        System.out.println(search(name, target));
    }

    private static boolean search(String name, char target) {
        if (name.length() == 0) return false;
        for (char ch : name.toCharArray()) { //.toCharArray change string into array of character, then we can iterate foe-each
            if (target == ch) return true;
        }
//        for (int i = 0; i < name.length(); i++) {
//            if (target == name.charAt(i)) return true;
//        }
        return false;
    }
}
