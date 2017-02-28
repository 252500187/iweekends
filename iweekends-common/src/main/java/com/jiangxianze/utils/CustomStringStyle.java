//package com.jiangxianze.utils;
//
//import org.apache.commons.lang.builder.ToStringStyle;
//
//import java.io.Serializable;
//
///**
// * @Comment 自定义 toString  style
// * @auther yangkai
// * @date 16/9/25 12:11
// */
//public class CustomStringStyle extends ToStringStyle implements Serializable {
//
//	private static final long serialVersionUID = 1;
//
//	public CustomStringStyle() {
//		super();
//		this.setUseShortClassName(true);
//		this.setUseIdentityHashCode(false);
//	}
//
//	/**
//	 * 默认样式,使用简短打印
//	 */
//	private Object readResolve() {
//		return ToStringStyle.SHORT_PREFIX_STYLE;
//	}
//
//	/**
//	 * 重写append 方法  空类型不打印
//	 *
//	 * @param buffer
//	 * @param fieldName
//	 * @param value
//	 * @param fullDetail
//	 */
//	@Override
//	public void append(StringBuffer buffer, String fieldName, Object value, Boolean fullDetail) {
//		if (value != null) {
//			super.append(buffer, fieldName, value, fullDetail);
//		}
//	}
//}
