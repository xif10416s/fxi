package org.fxi.test.jvmparams;

/**

 * @Described�����������һ��ֵ��ʱ�����������  Ĭ��ֵ15��

 * VM params : -Xms20M -Xmx20M -Xmn10M -XX:MaxTenuringThreshold=1 -XX:+PrintGCDetails -verbose:gc

 * Edon s0 s1 old  age

 *   8  1   1  10   1

 * @author YHJ create at 2012-1-3 ����05:39:16

 * @FileNmaecom.yhj.jvm.gc.longLifeTimeIntoOld.LongLifeTimeIntoOld.java

 */

public class LongLifeTimeIntoOld {

 

    private final static int ONE_MB = 1024*1024;

 

    /**

     * @param args

     * @Author YHJ create at 2012-1-3 ����04:44:38

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
     * �Ӵ��������ǿ��Կ�������testCase1����Ϊ0.25MB���ݣ�
     * ���ж�δ���󴴽�֮��testCase1Ӧ����GCִ��֮�󱻸��Ƶ�s0����s0��������testCase1��
     * ���������������˶��������Ϊ1��������1������������
     * �����GCִ��2�κ�testCase1ֱ�ӱ����Ƶ�������������Ĭ�Ͻ���������������Ϊ15������ͨ��profilter�ļ�ع��߿��Ժ�����Ŀ�����������䣬��ͼ��ʾ
     * 
     */
 

}