public class String_Methods {
    public static void main(String[] args){
        String name = "Aditi";
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "Aditi  Yadav";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(3));

        System.out.println(name.substring(1,4));

        System.out.println(name.replace('t','d'));

        System.out.println(name.startsWith("Ad"));
        System.out.println(name.endsWith("Ad"));

        System.out.println(name.charAt(1));

        System.out.println(name.indexOf("A"));
        System.out.println(name.indexOf("i",3));

        System.out.println(name.equals("Aditi"));
    }
}
