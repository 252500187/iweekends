package com.jiangxianze.utils;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * 获取properties文件
 *
 * @author yangkai
 */
public class PropertyUtil {

	private static final String DEFAULT_CHARSET = "UTF-8";  //编码

	/**
	 * 获取properties文件
	 *
	 * @param path
	 * @param chartset
	 * @return
	 * @throws Exception
	 */
	public static Properties getProperties(String path, String chartset) throws Exception {
		Properties prop = new Properties();// 属性集合对象     
		InputStream input = null;
		InputStreamReader reader = null;
		try {
			input = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
			reader = new InputStreamReader(input, chartset);
			prop.load(reader);
		} finally {
			if (input != null) {
				input.close();
			}
			if (reader != null) {
				reader.close();
			}
		}
		return prop;
	}

	public static Properties getProperties(String path) throws Exception {
		return getProperties(path, DEFAULT_CHARSET);
	}

}
