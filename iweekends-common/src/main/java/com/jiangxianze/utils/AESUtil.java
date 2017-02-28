package com.jiangxianze.utils;



import com.sun.org.apache.xml.internal.security.utils.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.UUID;

public class AESUtil {

	private static final String AESTYPE = "AES/ECB/PKCS5Padding";
	private static final String DEFAULT_CHARSET = "UTF-8";  //编码
	private static final String ALGORITHM = "AES"; //算法

	/**
	 * 加密
	 *
	 * @param plainText
	 * @param key       盐值
	 * @return
	 */
	public static String encrypt(String plainText, String key) throws Exception {
		return encrypt(plainText, key, DEFAULT_CHARSET);
	}

	/**
	 * 加密
	 *
	 * @param plainText
	 * @param keyStr    盐值
	 * @param chartset  编码
	 * @return
	 */
	public static String encrypt(String plainText, String keyStr, String chartset) throws Exception {
		Key key = new SecretKeySpec(keyStr.getBytes(), ALGORITHM);
		Cipher cipher = Cipher.getInstance(AESTYPE);
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] encrypt = cipher.doFinal(plainText.getBytes(chartset));
		return new String(Base64.encode(encrypt));
	}

	/**
	 * 解密
	 *
	 * @param encryptData
	 * @param keyStr      盐值
	 * @return
	 */
	public static String decrypt(String encryptData, String keyStr) throws Exception {
		Key key = new SecretKeySpec(keyStr.getBytes(), ALGORITHM);
		Cipher cipher = Cipher.getInstance(AESTYPE);
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] decrypt = cipher.doFinal(Base64.decode(encryptData));
		return new String(decrypt).trim();
	}

	public static void main(String[] args) throws Exception {
		String uuid = UUID.randomUUID().toString();
		String uid = uuid.replaceAll("-", "qd");
		System.out.println(uid);
		System.out.println(uid.substring(0, 32));
		System.out.println(uid.substring(0, 16));
		//System.out.println(UUID.fromString("qudian_aes"));
	}

}
