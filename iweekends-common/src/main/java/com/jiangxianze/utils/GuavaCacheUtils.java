//package com.jiangxianze.utils;
//
//
//
//import sun.security.util.Cache;
//
//import java.util.concurrent.Callable;
//import java.util.concurrent.TimeUnit;
//import java.util.logging.Logger;
//
///**
// * 本地缓存工具
// * @author  pangyiyang
// * @date	2016年4月15日 下午5:20:50
// */
//public class GuavaCacheUtils {
//    private static Logger logger = LoggerFactory.getLogger(GuavaCacheUtils.class) ;
//
//    /**
//     * 数据库路由缓存，存储5分钟
//     */
//    private static Cache<Object,Object> dbCache = CacheBuilder.newBuilder().maximumSize(2000).expireAfterWrite(5, TimeUnit.MINUTES).build();
//
//    private static Cache<Object,Object> ssCache = CacheBuilder.newBuilder().maximumSize(5000).build();
//
//    /**
//     * 数据库缓存
//     * @param k
//     * @param cable
//     * @return
//     */
//    @SuppressWarnings("unchecked")
//    public static <K,V> V getDbCache(K k,Callable<V> cable){
//        try {
//            return (V) dbCache.get(k, cable);
//        } catch (Throwable t) {
//            logger.error("GuavaCacheUtil | getDbCache | error", t);
//        }
//        return null;
//    }
//
//    /**
//     * 安全存储缓存
//     * @param k
//     * @param cable
//     * @return
//     */
//    @SuppressWarnings("unchecked")
//    public static <K,V> V getSSCache(K k,Callable<V> cable){
//        try {
//            return (V) ssCache.get(k, cable);
//        } catch (Throwable t) {
//            logger.error("GuavaCacheUtil | getSSCache | error", t);
//        }
//        return null;
//    }
//}
