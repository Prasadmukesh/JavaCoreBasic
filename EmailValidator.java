import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    // Regex pattern for validating an email address
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+)\\.([A-Za-z]{2,})$";

    // Method to validate the email
    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        // Create a Pattern object
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        
        // Create a matcher object
        Matcher matcher = pattern.matcher(email);
        
        // Check if the email matches the pattern
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Test some email addresses
        String[] testEmails = {
            "test@example.com",    // valid email
            "test.email@domain.co", // valid email
            "invalid-email.com",   // invalid email
            "test@.com",            // invalid email
            "user@domain@domain.com",
            "akhil2000.java@gmail.com",
            "shivani_yadav.up@gmail.co.in" // invalid email
        };

        for (String email : testEmails) {
            System.out.println(email + " : " + isValidEmail(email));
        }
    }
}
