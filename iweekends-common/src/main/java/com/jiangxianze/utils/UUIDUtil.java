package com.jiangxianze.utils;

import java.util.Locale;
import java.util.UUID;

/**
 * Created by lxc on 16/7/29.
 */
public class UUIDUtil {

	public static String randomUUID() {
		return UUID.randomUUID().toString().replace("-", "").toLowerCase(Locale.ENGLISH);
	}
}
