package com.test.innoctive.utility;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Primitives;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class EncryptDecrypt {
    private static CryptLib cryptLib;

    static{
        try {
            cryptLib = new CryptLib();
        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
//            e.printStackTrace();
        }
    }

    public static String encryptData(String data){
        try {
            data = cryptLib.encrypt(data, ConstantValue.KEY, ConstantValue.IV);
            data = data.replace("\n", "");
        } catch (InvalidKeyException e) {
//            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
//            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
//            e.printStackTrace();
        } catch (BadPaddingException e) {
//            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
        }
        return data;
    }

    public static String decryptData(String data) throws JsonSyntaxException {
        try {
            data = cryptLib.decrypt(data, ConstantValue.KEY, ConstantValue.IV);
        } catch (InvalidKeyException e) {
//            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
//            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
//            e.printStackTrace();
        } catch (BadPaddingException e) {
//            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
        }
        return data;
    }

    public static <T> T decryptData(String data, Class<T> classOfT) throws JsonSyntaxException {
        try {
            data = cryptLib.decrypt(data, ConstantValue.KEY, ConstantValue.IV);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        Object object = new Gson().fromJson(data, classOfT);
        return Primitives.wrap(classOfT).cast(object);
    }
}