// I worked on the assignment alone, using only course-provided materials.
/**
* HW1 - PrimitiveOperations
**
@author XX3972406
* @version 1.1
*/
public class PrimitiveOperations {
    /**
     * Main method to print the solution.
     * @param args argument for main method.
     */
    public static void main(String[] args) {
        int maxInt;
        double pi;
        maxInt = 2147483647;
        pi = 3.14;

        System.out.println(maxInt);
        System.out.println(pi);

        double multiplication = maxInt * pi;
        System.out.println(multiplication);

        double newDouble = (double) maxInt;
        System.out.println(newDouble);

        int newInt = (int) pi;
        System.out.println(newInt);

        char upperCase;
        upperCase = 'M';
        int charAscii = (int) upperCase;
        System.out.println(upperCase);
        // In terms of ASCII we just need to add 32 to get the
        // lower case ascii value.
        char lowerCase = (char) (charAscii + 32);
        System.out.println(lowerCase);

    }
}