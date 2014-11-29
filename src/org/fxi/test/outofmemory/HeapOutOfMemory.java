package org.fxi.test.outofmemory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Described£º¶ÑÄÚ´æÒç³öÌ½¾¿
 * @VM args :-Xmx10m -Xms10m -Xloggc:HeapOutOfMemoryGC.log -XX:HeapDumpPath=./HeapOutOfMemory.hprof -verbose:gc -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:PrintHeapAtGC -XX:+HeapDumpOnOutOfMemoryError
 * 
 */
public class HeapOutOfMemory {
	List<Date> list = new ArrayList<Date>();

	public static void main(String[] args) {
		HeapOutOfMemory instance = new HeapOutOfMemory();
		while (true) {
			instance.list.add(new Date());
		}
	}
}
