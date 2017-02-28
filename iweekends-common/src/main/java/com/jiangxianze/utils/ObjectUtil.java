//package com.jiangxianze.utils;
//
//
//import java.beans.BeanInfo;
//import java.beans.Introspector;
//import java.beans.PropertyDescriptor;
//import java.lang.reflect.Method;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.logging.Logger;
//
///**
// * 对象判断小工具类
// *
// * @author wangyunfeng
// */
//public final class ObjectUtil {
//	private static final Logger LOG = LoggerFactory.getLogger(ObjectUtil.class);
//
//	/**
//	 * 判读对象是否为null
//	 *
//	 * @param object
//	 * @return boolean
//	 */
//	public static boolean isNull(Object object) {
//		return object == null;
//	}
//
//	/**
//	 * 判读对象的内容是否为null
//	 *
//	 * @param object
//	 * @return boolean
//	 */
//	public static boolean isNullValue(Object object) {
//		if (object == null) {
//			return true;
//		} else {
//			if (object instanceof Integer) {
//				return (Integer) object == 0;
//			}
//			if (object instanceof Long) {
//				return (Long) object == 0;
//			} else {
//				return isEmpty(object);
//			}
//		}
//	}
//
//	/**
//	 * 判读对象的内容是否不为null
//	 *
//	 * @param object
//	 * @return boolean
//	 */
//	public static boolean isNotNullValue(Object object) {
//		return !isNullValue(object);
//	}
//
//	/**
//	 * 判读对象数组中是否有null
//	 *
//	 * @param objects
//	 * @return boolean
//	 */
//	public static boolean hasNull(Object... objects) {
//		if (isNull(objects)) {
//			return true;
//		}
//
//		for (int i = 0; i < objects.length; i++) {
//			if (isNull(objects[i])) {
//				LOG.info("{} is null", i);
//				return true;
//			}
//		}
//		return false;
//	}
//
//	/**
//	 * 判读对象数组中是否都为null
//	 *
//	 * @param objects
//	 * @return boolean
//	 */
//	public static boolean allNull(Object... objects) {
//		if (isNull(objects)) {
//			return true;
//		}
//
//		for (Object object : objects) {
//			if (isNotNull(object)) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	/**
//	 * 判读对象是否不为null
//	 *
//	 * @param object
//	 * @return boolean
//	 */
//	public static boolean isNotNull(Object object) {
//		return object != null;
//	}
//
//	/**
//	 * 判读对象是否为空 (string map list set 等包含是否为空)
//	 *
//	 * @param object
//	 * @return boolean
//	 */
//	public static boolean isEmpty(Object object) {
//		if (object == null) {
//			return true;
//		}
//
//		if (object instanceof String) {
//			if (object.equals("")) {
//				return true;
//			}
//		} else if (object instanceof Map) {
//			if (((Map<?, ?>) object).isEmpty()) {
//				return true;
//			}
//		} else if (object instanceof Collection) {
//			if (((Collection<?>) object).isEmpty()) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//	/**
//	 * 判读对象是否不为空 (string map list set 等包含是否不为空)
//	 *
//	 * @param object 数据
//	 * @return boolean
//	 */
//	public static boolean isNotEmpty(Object object) {
//		return !isEmpty(object);
//	}
//
//	/**
//	 * 判读对象数组中是否有empty
//	 *
//	 * @param objects 数据
//	 * @return boolean
//	 */
//	public static boolean hasEmpty(Object... objects) {
//		if (isNull(objects)) {
//			return true;
//		}
//
//		for (int i = 0; i < objects.length; i++) {
//			if (isEmpty(objects[i])) {
//				LOG.info("{} is empty", i);
//				return true;
//			}
//		}
//		return false;
//	}
//
//	/**
//	 * 判读对象数组是否是empty
//	 *
//	 * @param ts 数据
//	 * @return boolean
//	 */
//	public static <T> boolean isArrayEmpty(T[] ts) {
//		return isNull(ts) || ts.length == 0;
//	}
//
//	/**
//	 * 对象转换成map
//	 * @param obj
//	 * @return
//	 * @throws Exception
//     */
//	public static Map<String,Object> objToMap(Object obj) throws Exception {
//		if(obj == null){
//			return null;
//		}
////        Map<String, Object> Objectmap = new HashMap<String, Object>();
//		Map<String, Object> map = new HashMap<String, Object>();
//
//		BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
//		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
//		for (PropertyDescriptor property : propertyDescriptors) {
//			String key = property.getName();
//			if (key.compareToIgnoreCase("class") == 0) {
//				continue;
//			}
//			Method getter = property.getReadMethod();
//			Object value = getter!=null ? getter.invoke(obj) : null;
//			map.put(key, value);
//		}
//
//		return map;
//	}
//}
