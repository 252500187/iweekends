//package com.jiangxianze.utils;
//
//
///**
// * 自定义mybatis generator resolver
// * yangkai
// */
//public class CustomJavaTypeResolver extends JavaTypeResolverDefaultImpl {
//
//	public CustomJavaTypeResolver() {
//		super();
//		//重新tinyint 转化成 Integer
//		this.typeMap.put(Integer.valueOf(-6), new JdbcTypeInformation("TINYINT", new FullyQualifiedJavaType(Integer.class.getName())));
//	}
//}
