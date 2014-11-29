package org.fxi.test.jvmparams;

/**

 * @Described：Edon优先划分对象测试

 * VM params : -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -verbose:gc

 * Edon s0 s1 old

 *   8  1   1  10

 * @author YHJ create at 2012-1-3 下午04:44:43

 * @FileNmae com.yhj.jvm.gc.edenFirst.EdonFirst.java

 */

public class EdonFirst {

 

    private final static int ONE_MB = 1024*1024;

 

    /**

     * @param args

     * @Author YHJ create at 2012-1-3 下午04:44:38

     */

    public static void main(String[] args) {

       @SuppressWarnings("unused")

       byte[] testCase1,testCase2,testCase3,testCase4;

       testCase1 = new byte[2*ONE_MB];

       testCase2 = new byte[2*ONE_MB];

       testCase3 = new byte[2*ONE_MB];

//     testCase1 = null;

//     testCase2 = null;

//     testCase3 = null;

       testCase4 = new byte[2*ONE_MB];

    }

  /**
   * 
   * 从运行结果我们可以很清晰的看到，eden有8MB的存储控件（通过参数配置）
   * ，前6MB的数据优先分配到eden区域,当下一个2MB存放时，因空间已满，触发一次GC
   * ，但是这部分数据因为没有回收（引用还在，当赋值为null后则不会转移）
   * ，数据会被复制到s0区域，但是s0区域不够存储，因此直接放入老生代区域，新的2MB数据存放在eden区域
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   */

}