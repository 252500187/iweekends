//package com.jiangxianze.utils;
//
//import java.io.UnsupportedEncodingException;
//
///**
// * @author yangkai
// * @Comment md5加密 验签
// * @date 2016年4月13日 下午2:09:02
// */
//public class MD5 {
//
//	private static final String DEFAULT_CHARSET = "UTF-8";  //编码
//
//	/**
//	 * 签名字符串
//	 *
//	 * @param text 需要签名的字符串
//	 * @param key  密钥
//	 * @return 签名结果
//	 */
//	public static String sign(String text, String key) {
//		return sign(text, key, DEFAULT_CHARSET);
//	}
//
//	/**
//	 * 签名字符串
//	 *
//	 * @param text 需要签名的字符串
//	 * @param key  密钥
//	 * @return 签名结果
//	 */
//	public static String sign(String text, String key, String charset) {
//		return DigestUtils.md5Hex(getContentBytes(text + key, charset));
//	}
//
//	/**
//	 * 签名字符串
//	 *
//	 * @param text          需要签名的字符串
//	 * @param sign          签名结果
//	 * @param key           密钥
//	 * @param input_charset 编码格式
//	 * @return 签名结果
//	 */
//	public static boolean verify(String text, String sign, String key, String input_charset) {
//		String mysign = DigestUtils.md5Hex(getContentBytes(text + key, input_charset));
//		return mysign.equals(sign);
//	}
//
//	/**
//	 * @param content
//	 * @param charset
//	 * @return
//	 * @throws UnsupportedEncodingException
//	 */
//	private static byte[] getContentBytes(String content, String charset) {
//		try {
//			if (charset == null || "".equals(charset)) {
//				return content.getBytes();
//			}
//			return content.getBytes(charset);
//		} catch (UnsupportedEncodingException e) {
//			throw new RuntimeException("MD5签名过程中出现错误,指定的编码集不对,您目前指定的编码集是:" + charset);
//		}
//	}
//}
