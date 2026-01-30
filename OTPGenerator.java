import java.util.Random;

public class OTPGenerator {

    public static String generateOTP(int length) {
        StringBuilder otp = new StringBuilder();
        Random random = new Random();
        
       // System.out.println(otp);
        for (int i = 0; i < length; i++) {
            int digit = random.nextInt(10);  // Generate a random digit between 0 and 9
            otp.append(digit);
        }

        return otp.toString();
    }

    public static void main(String[] args) {
        int otpLength = 4;  // You can specify OTP length here
        String otp = generateOTP(otpLength);
        System.out.println("Generated OTP: " + otp);
    }
}
