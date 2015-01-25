package org.fxi.test.jvmparams;

/**

 * @Described：大对象直接进入老生代测试

 * VM params : -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -verbose:gc

 * Edon s0 s1 old

 *   8  1   1  10

 * @author YHJ create at 2012-1-3 下午05:28:47

 * @FileNmae com.yhj.jvm.gc.bigObjIntoOld.BigObjIntoOld.java

 */

public class BigObjIntoOld {

 

    private final static int ONE_MB = 1024*1024;

    private final static int ONE_MB3 = 1024*1024;
 

    /**

     * @param args

     * @Author YHJ create at 2012-1-3 下午04:44:38

     */

    public static void main(String[] args) {

       @SuppressWarnings("unused")

       byte[] testCase1,testCase2,testCase3,testCase4;

       testCase1 = new byte[8*ONE_MB];

//     testCase2 = new byte[2*ONE_MB];

//     testCase3 = new byte[2*ONE_MB];

//     testCase1 = null;

//     testCase2 = null;

//     testCase3 = null;

//     testCase4 = new byte[2*ONE_MB];

    }

    /**
     * 没有触发GC日志，而数据是直接进入老生代的
     */
 

}
