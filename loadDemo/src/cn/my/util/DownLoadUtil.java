package cn.my.util;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;

public abstract class DownLoadUtil {
    public static String base64EncodeFileName(String fileName){
        BASE64Encoder base64Encoder = new BASE64Encoder();
        try {
            return "=?utf-8?B?"+base64Encoder.encode(fileName.getBytes("utf-8"))+"?=";
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
