import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndianPhoneNumberValidator {

    // Regex pattern for validating an Indian phone number
    private static final String INDIAN_PHONE_NUMBER_REGEX = "^(\\+91[-\\s]?)?([7-9]{1}[0-9]{9})$";

    // Method to validate the phone number
    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return false;
        }

        // Create a Pattern object
        Pattern pattern = Pattern.compile(INDIAN_PHONE_NUMBER_REGEX);
        
        // Create a matcher object
        Matcher matcher = pattern.matcher(phoneNumber);
        
        // Check if the phone number matches the pattern
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Test some phone numbers
        String[] testPhoneNumbers = {
            "+91 9876543210",     // valid phone number with country code and space
            "9876543210",         // valid phone number without country code
            "+91-9876543210",     // valid phone number with country code and hyphen
            "+91 98765 43210",    // valid phone number with country code and space in between
            "+91 1234567890",     // invalid phone number (starts with 1)
            "1987654321",         // invalid phone number (starts with 1)
            "+92 9876543210",     // invalid phone number (country code is not +91)
            "+91 9876-543210",    // valid phone number with country code and mixed separator
            "98765 4321"          // invalid phone number (too short)
        };

        for (String phoneNumber : testPhoneNumbers) {
            System.out.println(phoneNumber + " : " + isValidPhoneNumber(phoneNumber));
        }
    }
}
