package com.julio.microservice_user.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

public class PasswordUtils {

    public static String getSHA512(final String input) {

        String toReturn = null;
        try {
            final MessageDigest digest = MessageDigest.getInstance("SHA-512");
            digest.reset();
            digest.update(input.getBytes("utf8"));
            toReturn = String.format("%0128x", new BigInteger(1, digest.digest()));
        } catch (final Exception e) {
            e.printStackTrace();
        }

        return toReturn;
    }
}
