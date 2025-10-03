package learn.core.java.concepts.TUFcode.StringOperation;

public class LargestOddNumberInString {

    public static void main(String[] args) {
        String num = "4206";
        System.out.println("Largest Odd Number: " + largestOddNumber(num));

        num = "35427";
        System.out.println("Largest Odd Number: " + largestOddNumber(num));

        num = "52";
        System.out.println("Largest Odd Number: " + largestOddNumber(num));

        num = "789654125";
        System.out.println("Largest Odd Number: " + largestOddNumber(num));
    }

    private static String largestOddNumber(String num) {
        // Traverse from rightmost digit to left
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0'; // convert char to int
            if (digit % 2 != 0) {
                // Found rightmost odd digit → substring till here is largest odd number
                String candidate = num.substring(0, i + 1);

                // Remove prefix zeros (leading zeros)
                candidate = candidate.replaceFirst("^0+", "");

                // If everything was zeros, return ""
                return candidate.isEmpty() ? "" : candidate;
            }
        }
        return ""; // No odd digit found
    }
}
