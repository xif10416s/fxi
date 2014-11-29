package org.fxi.test.jvmparams;

/**

 * @Described：当年龄大于一定值的时候进入老生代  默认值15岁

 * VM params : -Xms20M -Xmx20M -Xmn10M -XX:MaxTenuringThreshold=1 -XX:+PrintGCDetails -verbose:gc

 * Edon s0 s1 old  age

 *   8  1   1  10   1

 * @author YHJ create at 2012-1-3 下午05:39:16

 * @FileNmaecom.yhj.jvm.gc.longLifeTimeIntoOld.LongLifeTimeIntoOld.java

 */

public class LongLifeTimeIntoOld {

 

    private final static int ONE_MB = 1024*1024;

 

    /**

     * @param args

     * @Author YHJ create at 2012-1-3 下午04:44:38

     */

    public static void main(String[] args) {

       @SuppressWarnings("unused")

       byte[] testCase1,testCase2,testCase3,testCase4;

       testCase1 = new byte[1*ONE_MB/4];

       testCase2 = new byte[7*ONE_MB+3*ONE_MB/4];

       testCase2 = null;

       testCase3 = new byte[7*ONE_MB+3*ONE_MB/4];

       testCase3 = null;

       testCase4 = new byte[ONE_MB];

    }

    /**
     * 
     * 从代码中我们可以看到，当testCase1划分为0.25MB数据，
     * 进行多次大对象创建之后，testCase1应该在GC执行之后被复制到s0区域（s0足以容纳testCase1）
     * ，但是我们设置了对象的年龄为1，即超过1岁便进入老生代
     * ，因此GC执行2次后testCase1直接被复制到了老生代，而默认进入老生代的年龄为15。我们通过profilter的监控工具可以很清楚的看到对象的年龄，如图所示
     * 
     */
 

}