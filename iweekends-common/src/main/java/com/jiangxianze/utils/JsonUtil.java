//package com.jiangxianze.utils;
//
//
//import java.util.Map;
//
///**
// * @Remark json工具
// * @Author yangkai
// * @Date 16/4/18 下午4:54
// */
//public class JsonUtil {
//
//	private JsonUtil() {
//	}
//
//	/**
//	 * map转换为字符串
//	 *
//	 * @param map
//	 * @return
//	 */
//	public static String mapToStr(Map<?, ?> map) {
//		if (ObjectUtil.isEmpty(map)) {
//			return null;
//		}
//
//		return JSON.toJSONString(map);
//	}
//
//	/**
//	 * str 转换对象
//	 *
//	 * @param str
//	 * @param c
//	 * @return
//	 */
//	public static <T> T coveryToEntity(String str, Class<T> c) {
//		if (ObjectUtil.isEmpty(str)) {
//			return null;
//		}
//		return JSON.parseObject(str, c);
//	}
//
//	/**
//	 * 对象转换为json字符串
//	 *
//	 * @param o
//	 * @return
//	 */
//	public static String objToStr(Object o) {
//		if (ObjectUtil.isNull(o)) {
//			return null;
//		}
//		return JSON.toJSONString(o);
//	}
//
//	/**
//	 * 根据key获取字符串
//	 *
//	 * @param text
//	 * @param key
//	 * @return
//	 */
//	public static String get(String text, String key) {
//		if (ObjectUtil.isEmpty(text)) {
//			return null;
//		}
//		JSONObject obj = JSON.parseObject(text);
//		return (String) obj.get(key);
//	}
//
//	public static JSONObject string2Json(String text) {
//		if (ObjectUtil.isEmpty(text)) {
//			return null;
//		}
//		return JSON.parseObject(text);
//	}
//
//	public static Object string2Object(String text, Class clzz) {
//		if (ObjectUtil.isEmpty(text)) {
//			return null;
//		}
//		return JSON.parseObject(text, clzz);
//	}
//}
