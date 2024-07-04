/**
 * HW1 - StringOperations
 @author - XX3972406
 @version - 1.1
 */
public class StringOperations {
    /**
     * HW1 - StringOperations
     @param args main arguments
    */
    public static void main(String[] args) {
        String mohammadAli = "Mohammad Ali";
        System.out.println(mohammadAli);
        String replacedString = mohammadAli.replaceFirst(Character.toString(mohammadAli.charAt(0)), "A");

        String replacedLastCharString = mohammadAli.replaceFirst(Character.toString(mohammadAli.charAt(replacedString.length() - 1)), "Z");
        System.out.println(replacedLastCharString);

        String url = "www.mohammadali.com";
        System.out.println(url);

        String[] arrOfStrings = url.split("\\.");


        String newString = arrOfStrings[1] + 1331;
        System.out.println(newString);

    }
}