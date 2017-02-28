package com.jiangxianze.utils;

/**
 * 放置请求IP
 */
public class ClientRemoteUtils {
	
	private static final ThreadLocal<String> REMOTE_ADDR = new ThreadLocal<String>();
	
	public static void putAddr(String ip){
		REMOTE_ADDR.set(ip);
	}
	
	public static String getAddr(){
		return REMOTE_ADDR.get();
	}
	
	public static void remove(){
		REMOTE_ADDR.remove();
	}
	
}
