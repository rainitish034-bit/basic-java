public class Day3{
    public static void main(String[] args) {
        String name = "Nitish";
        //System.out.println(name);
       // int value = name.length();
        //System.out.println(value);
        String lString= name.toLowerCase();
        System.out.println(lString);
       String uString= name.toUpperCase();
        System.out.println(uString);
        //String nonTrimmedString = "   Nitish   ";
        //System.out.println(nonTrimmedString);
       // System.out.println(name.substring(2));
       //System.out.println(name.replace('t','k'));
       //System.out.println(name.startsWith("nit"));
       //System.out.println(name.endsWith("sh")); 
       //System.out.println(name.charAt(4));
       //System.out.println(name.indexOf("s"));
       System.out.println(name.indexOf("t",3));
        
    }
}