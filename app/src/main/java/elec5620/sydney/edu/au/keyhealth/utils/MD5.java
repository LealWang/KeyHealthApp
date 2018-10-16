package elec5620.sydney.edu.au.keyhealth.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    public static String md5(String plainText){

        byte[] secretBytes = null;
        try {

            MessageDigest md = MessageDigest.getInstance("MD5");

            md.update(plainText.getBytes());

            secretBytes = md.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("no md5");
        }

        String md5code = new BigInteger(1, secretBytes).toString(16);// 16进制数字

        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;


    }
}
