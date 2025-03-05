public class OTPGenerator {

    // generate a 6-digit OTP number
    public static int generateOTP() {
        int otp = (int) (Math.random() * 900000) + 100000; 
        return otp;
    }

    // check if all OTPs are unique by comparing each OTP with others
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; 
                }
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        if (areOTPsUnique(otps)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nThere are duplicate OTPs.");
        }
    }
}
