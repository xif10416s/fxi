package org.fxi.test.jvmparams;

/**

 * @Described��Edon���Ȼ��ֶ������

 * VM params : -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -verbose:gc

 * Edon s0 s1 old

 *   8  1   1  10

 * @author YHJ create at 2012-1-3 ����04:44:43

 * @FileNmae com.yhj.jvm.gc.edenFirst.EdonFirst.java

 */

public class EdonFirst {

 

    private final static int ONE_MB = 1024*1024;

 

    /**

     * @param args

     * @Author YHJ create at 2012-1-3 ����04:44:38

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
   * �����н�����ǿ��Ժ������Ŀ�����eden��8MB�Ĵ洢�ؼ���ͨ���������ã�
   * ��ǰ6MB���������ȷ��䵽eden����,����һ��2MB���ʱ����ռ�����������һ��GC
   * �������ⲿ��������Ϊû�л��գ����û��ڣ�����ֵΪnull���򲻻�ת�ƣ�
   * �����ݻᱻ���Ƶ�s0���򣬵���s0���򲻹��洢�����ֱ�ӷ��������������µ�2MB���ݴ����eden����
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