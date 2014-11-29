package org.fxi.test.outofmemory;

import java.util.ArrayList;
import java.util.List;

/** 
 * @Described：常量池内存溢出探究 
 * @VM args : -XX:PermSize=10M -XX:MaxPermSize=10M -XX:HeapDumpPath=./ConstantOutOfMemory.hprof -verbose:gc  -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+HeapDumpOnOutOfMemoryError
 * @author YHJ create at 2011-10-30 下午04:28:30 
 * @FileNmae com.yhj.jvm.memory.constant.ConstantOutOfMemory.java 
 */  
public class ConstantOutOfMemory {  
    /** 
     * @param args 
     * @throws Exception 
     * @Author YHJ create at 2011-10-30 下午04:28:25 
     */  
    public static void main(String[] args) throws Exception {  
       try {  
           List<String> strings = new ArrayList<String>();  
           int i = 0;  
           while(true){  
              strings.add(String.valueOf(i++).intern());  
           }  
       } catch (Exception e) {  
           e.printStackTrace();  
           throw e;  
       }  
    }  
}  