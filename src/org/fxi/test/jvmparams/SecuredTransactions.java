package org.fxi.test.jvmparams;

/**

 * @Described：担保交易测试

 * VM params : -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -verbose:gc-XX:-HandlePromotionFailure  无担保

 * VM params : -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -verbose:gc-XX:+HandlePromotionFailure  有担保

 * Edon s0 s1 old  

 *   8  1   1  10  

 * @author YHJ create at 2012-1-3 下午06:11:17

 * @FileNmaecom.yhj.jvm.gc.securedTransactions.SecuredTransactions.java
担保GC就是担保minorGC能够满足当前的存储空间
，而无需触发老生代的回收，由于大部分对象都是朝生夕死的
，因此，在实际开发中这种很起效，但是也有可能会发生担保失败的情况
，当担保失败的时候会触发FullGC
，但是失败毕竟是少数，因此这种一般是很划算的。
 */

public class SecuredTransactions {

 

    private final static int ONE_MB = 1024*1024;

 

    /**

     * @param args

     * @Author YHJ create at 2012-1-3 下午04:44:38

     */

    public static void main(String[] args) {

       @SuppressWarnings("unused")

       byte[] testCase1,testCase2,testCase3,testCase4,testCase5,testCase6,testCase7;

       testCase1 = new byte[2*ONE_MB];

       testCase2 = new byte[2*ONE_MB];

       testCase3 = new byte[2*ONE_MB];

       testCase1 = null;

       testCase4 = new byte[2*ONE_MB];

       testCase5 = new byte[2*ONE_MB];

       testCase6 = new byte[2*ONE_MB];

       testCase4 = null;

       testCase5 = null;

       testCase6 = null;

       testCase7 = new byte[2*ONE_MB];

      

    }

 

}
