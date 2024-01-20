import java.util.Locale;

public class CWH_14_StringMethods {
    public static void main(String[] args) {
        String a = "Harry";
        // String a1 = new String("Harry"); => ye already dekh liya tha.

        // Strings are Immutable urf string kabhi bhi change nahi hogi.
        System.out.println(a);

        int value = a.length();
        System.out.println(value);

        String lstring = a.toLowerCase();
        System.out.println(lstring);

        String ustring = a.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "        Harry       ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(a.substring(3));

        System.out.println(a.substring(1, 3));

        System.out.println(a.replace('r', 'p'));

        System.out.println(a.replace("rry", "ier"));

        System.out.println(a.replace("r", "ier"));

        System.out.println(a.startsWith("Har"));

        System.out.println(a.endsWith("Hap"));

        System.out.println(a.charAt(4));

        System.out.println(a.indexOf("r"));

        System.out.println(a.indexOf("r", 2));

        System.out.println(a.indexOf("rry", 2));

        System.out.println(a.lastIndexOf("rr"));

        System.out.println(a.lastIndexOf("r", 2));

        System.out.println(a.equals("Harry"));

        System.out.println(a.equalsIgnoreCase("hARRY"));

        System.out.println("I am escape sequence \" double quote");

    }
}
