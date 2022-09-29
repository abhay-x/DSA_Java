package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
        String name = "Abhay Raj";
        //way1
        Pattern p = Pattern.compile(".b"); //the pattern which we want to match
        Matcher m = p.matcher("Abhay Raj");  //the input to which we want to match
        System.out.println(m.matches()); //return boolean
        //way2
        System.out.println(Pattern.compile(".s").matcher("as").matches());
        //way3
        System.out.println(Pattern.matches(".s", "ab"));
    }
}

/*
3.Pattern class
1	static Pattern compile(String regex)	compiles the given regex and returns the instance of the Pattern.
2	Matcher matcher(CharSequence input)	creates a matcher that matches the given input with the pattern.
3	static boolean matches(String regex, CharSequence input)	It works as the combination of compile and matcher methods. It compiles the regular expression and matches the given input with the pattern.
4	String[] split(CharSequence input)	splits the given input string around matches of given pattern.
5	String pattern()	returns the regex pattern.
-----------Regex Character classes-----------
No.	Character Class	Description
1	[abc]	a, b, or c (simple class)
2	[^abc]	Any character except a, b, or c (negation)
3	[a-zA-Z]	a through z or A through Z, inclusive (range)
4	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
5	[a-z&&[def]]	d, e, or f (intersection)
6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
7	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)
-----------Regex Quantifiers----------------
The quantifiers specify the number of occurrences of a character.
Regex	Description
X?	X occurs once or not at all
X+	X occurs once or more times
X*	X occurs zero or more times
X{n}	X occurs n times only
X{n,}	X occurs n or more times
X{y,z}	X occurs at least y times but less than z times
----------Regex Metacharacters--------------
The regular expression metacharacters work as shortcodes.
Regex	Description
.	Any character (may or may not match terminator)
\d	Any digits, short of [0-9]
\D	Any non-digit, short for [^0-9]
\s	Any whitespace character, short for [\t\n\x0B\f\r]
\S	Any non-whitespace character, short for [^\s]
\w	Any word character, short for [a-zA-Z_0-9]
\W	Any non-word character, short for [^\w]
\b	A word boundary
\B	A non word boundary
--------------------------------------------
 */