package com.test.innoctive.utility;

import android.util.Base64;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CryptLib {

    /**
     * Encryption mode enumeration
     * https://github.com/Pakhee/Cross-platform-AES-encryption/blob/master/Android/CryptLib.java
     */
    private enum EncryptMode {
        ENCRYPT, DECRYPT;
    }

    // cipher to be used for encryption and decryption
    Cipher _cx;

    // encryption key and initialization vector
    byte[] _key, _iv;

    public CryptLib() throws NoSuchAlgorithmException, NoSuchPaddingException {
        _cx = Cipher.getInstance("AES/CBC/PKCS7Padding");
        _key = new byte[32]; //256 bit key space
        _iv = new byte[16]; //128 bit IV

    }

    /**
     * Note: This function is no longer used.
     * This function generates md5 hash of the input string
     *
     * @param inputString
     * @return md5 hash of the input string
     */
    public static final String md5(final String inputString) {
        final String MD5 = "MD5";
        try {
            // Create MD5 Hash
            MessageDigest digest = MessageDigest
                    .getInstance(MD5);
            digest.update(inputString.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuilder hexString = new StringBuilder();
            for (byte aMessageDigest : messageDigest) {
                String h = Integer.toHexString(0xFF & aMessageDigest);
                while (h.length() < 2)
                    h = "0" + h;
                hexString.append(h);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
        }
        return "";
    }

    /**
     * @param _inputText     Text to be encrypted or decrypted
     * @param _encryptionKey Encryption key to used for encryption / decryption
     * @param _mode          specify the mode encryption / decryption
     * @param _initVector    Initialization vector
     * @return encrypted or decrypted string based on the mode
     * @throws UnsupportedEncodingException
     * @throws InvalidKeyException
     * @throws InvalidAlgorithmParameterException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     */
    private String encryptDecrypt(String _inputText, String _encryptionKey,
                                  EncryptMode _mode, String _initVector) throws UnsupportedEncodingException,
            InvalidKeyException, InvalidAlgorithmParameterException,
            IllegalBlockSizeException, BadPaddingException {
        String _out = "";

        int len = _encryptionKey.getBytes("UTF-8").length; // length of the key	provided

        if (_encryptionKey.getBytes("UTF-8").length > _key.length)
            len = _key.length;

        int ivlen = _initVector.getBytes("UTF-8").length;

        if (_initVector.getBytes("UTF-8").length > _iv.length)
            ivlen = _iv.length;

        System.arraycopy(_encryptionKey.getBytes("UTF-8"), 0, _key, 0, len);
        System.arraycopy(_initVector.getBytes("UTF-8"), 0, _iv, 0, ivlen);
        //KeyGenerator _keyGen = KeyGenerator.getInstance("AES");
        //_keyGen.init(128);

        SecretKeySpec keySpec = new SecretKeySpec(_key, "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(_iv);

        // encryption
        if (_mode.equals(EncryptMode.ENCRYPT)) {
            _cx.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);// Initialize this cipher instance
            byte[] results = _cx.doFinal(_inputText.getBytes("UTF-8")); // Finish

            // if encrypted data is required in base64 Format on 14-12-2017
            _out = Base64.encodeToString(results, Base64.DEFAULT); // ciphertext

            // if encrypted data is required in HEX Format on 14-12-2017
            //  _out = bytesToHex(results); // ciphertext output
        }

        // decryption
        if (_mode.equals(EncryptMode.DECRYPT)) {
            _cx.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);// Initialize this ipher instance
            // if decrypt data is required in base64 Format on 14-12-2017
            byte[] decodedValue = Base64.decode(_inputText.getBytes(), Base64.DEFAULT);
            // if decrypt data is required in HEX Format on 14-12-2017
            // byte[] decodedValue = decodeHex(_inputText); // for hex value
            byte[] decryptedVal = _cx.doFinal(decodedValue); // Finish
            _out = new String(decryptedVal);
            //Log.e("Decrypt", _out); //To view decrypt value
        }
        return _out; // return encrypted/decrypted string
    }

    public static String bytesToHex(byte[] bytes) {
        char[] hexArray = "0123456789ABCDEF".toCharArray();
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }

        for (byte b : bytes) {
            String st = String.format("%02X", b);
            System.out.print(st);
        }

        return new String(hexChars);
    }


    /***
     * This function computes the SHA256 hash of input string
     * @param text input text whose SHA256 hash has to be computed
     * @param length length of the text to be returned
     * @return returns SHA256 hash of input text
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static String SHA256(String text, int length) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        String resultStr;
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        md.update(text.getBytes("UTF-8"));
        byte[] digest = md.digest();

        StringBuffer result = new StringBuffer();
        for (byte b : digest) {
            result.append(String.format("%02x", b)); //convert to hex
        }
        //return result.toString();

        if (length > result.toString().length()) {
            resultStr = result.toString();
        } else {
            resultStr = result.toString().substring(0, length);
        }

        return resultStr;

    }

    /***
     * This function encrypts the plain text to cipher text using the key
     * provided. You'll have to use the same key for decryption
     *
     * @param _plainText
     *            Plain text to be encrypted
     * @param _key
     *            Encryption Key. You'll have to use the same key for decryption
     * @param _iv
     * 	    initialization Vector
     * @return returns encrypted (cipher) text
     * @throws InvalidKeyException
     * @throws UnsupportedEncodingException
     * @throws InvalidAlgorithmParameterException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     */

    public String encrypt(String _plainText, String _key, String _iv)
            throws InvalidKeyException, UnsupportedEncodingException,
            InvalidAlgorithmParameterException, IllegalBlockSizeException,
            BadPaddingException {
        return encryptDecrypt(_plainText, _key, EncryptMode.ENCRYPT, _iv);
    }

    public String encryptSimple(String _plainText, String _key, String _iv)
            throws InvalidKeyException, UnsupportedEncodingException,
            InvalidAlgorithmParameterException, IllegalBlockSizeException,
            BadPaddingException, NoSuchAlgorithmException {
        return encryptDecrypt(_plainText, CryptLib.SHA256(_key, 32), EncryptMode.ENCRYPT, _iv);
    }


    /***
     * This funtion decrypts the encrypted text to plain text using the key
     * provided. You'll have to use the same key which you used during
     * encryprtion
     *
     * @param _encryptedText
     *            Encrypted/Cipher text to be decrypted
     * @param _key
     *            Encryption key which you used during encryption
     * @param _iv
     * 	    initialization Vector
     * @return encrypted value
     * @throws InvalidKeyException
     * @throws UnsupportedEncodingException
     * @throws InvalidAlgorithmParameterException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     */
    public String decrypt(String _encryptedText, String _key, String _iv)
            throws InvalidKeyException, UnsupportedEncodingException,
            InvalidAlgorithmParameterException, IllegalBlockSizeException,
            BadPaddingException {
        return encryptDecrypt(_encryptedText, _key, EncryptMode.DECRYPT, _iv);
    }

    public String decryptSimple(String _encryptedText, String _key, String _iv)
            throws InvalidKeyException, UnsupportedEncodingException,
            InvalidAlgorithmParameterException, IllegalBlockSizeException,
            BadPaddingException, NoSuchAlgorithmException {
        return encryptDecrypt(_encryptedText, CryptLib.SHA256(_key, 32), EncryptMode.DECRYPT, _iv);
    }

    /**
     * this function generates random string for given length
     *
     * @param length Desired length
     *               * @return
     */
    public static String generateRandomIV(int length) {
        SecureRandom ranGen = new SecureRandom();
        byte[] aesKey = new byte[16];
        ranGen.nextBytes(aesKey);
        StringBuffer result = new StringBuffer();
        for (byte b : aesKey) {
            result.append(String.format("%02x", b)); //convert to hex
        }
        if (length > result.toString().length()) {
            return result.toString();
        } else {
            return result.toString().substring(0, length);
        }
    }

    private static final char[] HEX_DIGITS = new char[]{
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    private static final char[] FIRST_CHAR = new char[256];
    private static final char[] SECOND_CHAR = new char[256];

    static {
        for (int i = 0; i < 256; i++) {
            FIRST_CHAR[i] = HEX_DIGITS[(i >> 4) & 0xF];
            SECOND_CHAR[i] = HEX_DIGITS[i & 0xF];
        }
    }

    private static final byte[] DIGITS = new byte['f' + 1];

    static {
        for (int i = 0; i <= 'F'; i++) {
            DIGITS[i] = -1;
        }
        for (byte i = 0; i < 10; i++) {
            DIGITS['0' + i] = i;
        }
        for (byte i = 0; i < 6; i++) {
            DIGITS['A' + i] = (byte) (10 + i);
            DIGITS['a' + i] = (byte) (10 + i);
        }
    }

    public static byte[] decodeHex(String hexString) {
        int length = hexString.length();

        if ((length & 0x01) != 0) {
            throw new IllegalArgumentException("Odd number of characters: " + hexString);
        }

        boolean badHex = false;
        byte[] out = new byte[length >> 1];
        for (int i = 0, j = 0; j < length; i++) {
            int c1 = hexString.charAt(j++);
            if (c1 > 'f') {
                badHex = true;
                break;
            }

            final byte d1 = DIGITS[c1];
            if (d1 == -1) {
                badHex = true;
                break;
            }

            int c2 = hexString.charAt(j++);
            if (c2 > 'f') {
                badHex = true;
                break;
            }

            final byte d2 = DIGITS[c2];
            if (d2 == -1) {
                badHex = true;
                break;
            }

            out[i] = (byte) (d1 << 4 | d2);
        }

        if (badHex) {
            throw new IllegalArgumentException("Invalid hexadecimal digit: " + hexString);
        }
        return out;
    }
}