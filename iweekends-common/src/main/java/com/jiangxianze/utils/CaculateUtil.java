package com.jiangxianze.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class CaculateUtil {

    public static final BigDecimal ZERO = new BigDecimal("0") ;
    public static final int STANDARD_SCALE = 4 ;
    public static final int STANDARD_ROUND_HALF = BigDecimal.ROUND_HALF_UP;

    private CaculateUtil(){}


    /**
     * 等额本息计算月供
     * @param yearRate
     * @param capital
     * @param periods
     * @return
     */
    public static final long getMonthly(BigDecimal yearRate , long capital , long periods){
        if(yearRate == null || 0 == yearRate.compareTo(CaculateUtil.ZERO)) {
            return 0l ;
        }
        //月利率
        double monthRate = yearRate.doubleValue() / 12 ;
        // (1 + 利率)^期数
        double d = Math.pow(1d + monthRate , periods) ;
        //计算结果
        double result = (capital * monthRate * d ) / (d - 1) ;
        return Long.valueOf(new DecimalFormat("#0").format(result)) ;
    }

    /**
     * 等额本息计算周供
     * @param yearRate
     * @param capital
     * @param periods
     * @return
     */
    public static final long getWeekly(BigDecimal yearRate , long capital , long periods){
        if(yearRate == null || 0 == yearRate.compareTo(CaculateUtil.ZERO)) {
            return 0l ;
        }
        double weekRate = yearRate.doubleValue() / 365 * 7 ;
        // (1 + 利率)^期数
        double d = Math.pow(1d + weekRate , periods) ;
        //计算结果com/qudian/pay/charging/common/utils/CaculateUtil.java:29
        double result = (capital * weekRate * d ) / (d - 1) ;
        return Long.valueOf(new DecimalFormat("#0").format(result)) ;
    }


    /**
     * 滞纳金第二种计算公式计算
     * @param rate
     * @param monthly       用户执行利率的月供
     * @param overdueDay
     * @return
     */
    public static final long getOverdue(BigDecimal rate , long monthly , long overdueDay){
        if(rate == null || 0 == rate.compareTo(CaculateUtil.ZERO)) {
            return 0l ;
        }
        double overdueRate = rate.doubleValue() ;
        double result = overdueRate * monthly * overdueDay ;
        return Long.valueOf(new DecimalFormat("#0").format(result)) ;
    }

    public static void main(String[] args){
        System.out.println(getMonthly(new BigDecimal("0.12") , 1200000 , 12)) ;
        System.out.println(Long.valueOf(new DecimalFormat("#0").format(0.1)));
    }

}
