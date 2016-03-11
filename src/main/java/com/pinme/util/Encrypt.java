package com.pinme.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Shivanagesh Chandra Mar 10, 2016 1:39:01 AM
 * fileEncrypt.java
 */
public class Encrypt {
	
	public static String getHash(String x){
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        md.update(x.getBytes());
        
        byte byteData[] = md.digest();
 
        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString().toUpperCase();
	}
	
}
