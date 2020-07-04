package Collections.level36.Shortener;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Helper {

    public static String generateRandomString() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }

    static void printMessage(String message) {
        System.out.println(message);
    }
}