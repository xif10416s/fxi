package org.fxi.test.jvmparams;

/**

 * @Described���������ײ���

 * VM params : -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -verbose:gc-XX:-HandlePromotionFailure  �޵���

 * VM params : -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -verbose:gc-XX:+HandlePromotionFailure  �е���

 * Edon s0 s1 old  

 *   8  1   1  10  

 * @author YHJ create at 2012-1-3 ����06:11:17

 * @FileNmaecom.yhj.jvm.gc.securedTransactions.SecuredTransactions.java
����GC���ǵ���minorGC�ܹ����㵱ǰ�Ĵ洢�ռ�
�������败���������Ļ��գ����ڴ󲿷ֶ����ǳ���Ϧ����
����ˣ���ʵ�ʿ��������ֺ���Ч������Ҳ�п��ܻᷢ������ʧ�ܵ����
��������ʧ�ܵ�ʱ��ᴥ��FullGC
������ʧ�ܱϾ����������������һ���Ǻܻ���ġ�
 */

public class SecuredTransactions {

 

    private final static int ONE_MB = 1024*1024;

 

    /**

     * @param args

     * @Author YHJ create at 2012-1-3 ����04:44:38

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
