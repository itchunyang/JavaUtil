package com.itchunyang.test;

import java.util.concurrent.TimeUnit;

/**
 * Created by luchunyang on 2016/11/1.
 */
public class TimeDemo {

    //毫秒MILLISECONDS  微妙MICROSECONDS  纳秒NANOSECONDS 之间进制1000
    public static void main(String[] args) {

        TimeUtilDemo();
    }

    private static void TimeUtilDemo() {
        //System.out.println(System.currentTimeMillis());//毫秒数

        /**
         * 纳秒
         * 这个返回值是一个从确定的值算起的，但是这个值是任意的，可能是一个未来的时间，所以返回值有可能是负数
         */
//        long start = System.nanoTime();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(""+(System.nanoTime() - start));

        //convert(long duration, TimeUnit unit)的意思将duration这个时间转化为本对象（this）所表示的时间形式。
        //至于duration是哪种形式的时间（MICROSECONDS，MILLISECONDS，NANOSECONDS，SECONDS的一种），则是通过参数TimeUnit unit来确定的
        //System.out.println("1 SECONDS = "+TimeUnit.MILLISECONDS.convert(1, TimeUnit.SECONDS)+" MILLISECONDS");
        //System.out.println("1 MICROSECONDS = "+TimeUnit.NANOSECONDS.convert(1,TimeUnit.MICROSECONDS)+" NANOSECONDS");

        System.out.println(TimeUnit.MILLISECONDS.toSeconds(2000));//2

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
