package com.jiangxianze.utils;

import java.util.Random;

/**
 * 概率工具类,用于权重计算
 * @author  pangyiyang
 * @date	2016年4月16日 下午1:51:55
 */
public class RandomUtils {

    public static Random rand = new Random(System.currentTimeMillis());
    /**
     * 根据随机数组返回某个区间 比如probability = [20,30,50] 则返回0/1/2，0、1、2的概率分别是20%、30%、50%
     *
     * @param probability
     * @return
     */
    public static int roll(Integer[] probability) {
        int sum = 0;
        for (Integer rd : probability) {
            sum += rd;
        }
        return roll(probability, sum);
    }

    public static int roll(Integer[] probability, int base) {
        int roll = getRandNumber(base);
        for (int i = 0; i < probability.length; i++) {
            if (roll < probability[i]) {
                return i;
            }
            roll -= probability[i];
        }
        return -1;
    }

    public static int getRandNumber(int maxNumber) {
        return rand.nextInt(maxNumber);
    }
}
