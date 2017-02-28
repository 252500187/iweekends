package com.jiangxianze.utils;

import java.math.BigDecimal;

public class BigDecimalUtil {

	public static final int STANDARD_ROUND_HALF = BigDecimal.ROUND_HALF_UP;

	public static final int STANDARD_SCALE = 2;
	/**
	 * 0
	 **/
	public static final BigDecimal ZERO = new BigDecimal("0");
	/**
	 * 100
	 **/
	public static final BigDecimal HUNDRED = new BigDecimal("100");

	/**
	 * 除法
	 *
	 * @param num1
	 * @param num2
	 * @return num1/num2
	 */
	public static BigDecimal divide(BigDecimal num1, BigDecimal num2, int scale, int roundingMode) {
		if (null == num1 || null == num2) {
			return ZERO;
		}
		if (num2.compareTo(ZERO) == 0) {
			return ZERO;
		}
		return num1.divide(num2, STANDARD_SCALE, STANDARD_ROUND_HALF);
	}

	/**
	 * 分转换成元,保留两位小数,四舍五入
	 *
	 * @param num1
	 * @return Bigdecimal num1
	 */
	public static BigDecimal convertToYuan(Long num1) {
		if (null == num1) {
			return ZERO;
		}
		BigDecimal num1BigDecimal = new BigDecimal(num1);
		return divide(num1BigDecimal, HUNDRED, STANDARD_SCALE, STANDARD_ROUND_HALF);
	}

	/**
	 * 减法操作,返回(保留两位小数,四舍五入)
	 *
	 * @param num1
	 * @param num2
	 * @return num1- num2
	 */
	public static BigDecimal subtract(BigDecimal num1, BigDecimal num2) {
		if (null == num1 || null == num2) {
			return ZERO;
		}
		BigDecimal temp = num1.subtract(num2);
		return temp.setScale(STANDARD_SCALE, STANDARD_ROUND_HALF);
	}

	/**
	 * 乘法操作 ,返回(保留两位小数,四舍五入)
	 *
	 * @param num1
	 * @param num2
	 * @return num1 * num2
	 */
	public static BigDecimal multiply(BigDecimal num1, BigDecimal num2) {
		if (null == num1 || null == num2) {
			return ZERO;
		}
		BigDecimal temp = num1.multiply(num2);
		return temp.setScale(STANDARD_SCALE, STANDARD_ROUND_HALF);
	}

	/**
	 * 元转换成分
	 *
	 * @param num1
	 * @return Bigdecimal num1
	 */
	public static Long convertToFen(BigDecimal num1) {
		if (null == num1) {
			return ZERO.longValue();
		}
		BigDecimal temp = multiply(num1, HUNDRED);
		return temp.longValue();
	}


}
