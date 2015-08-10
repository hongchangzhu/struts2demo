package com.haochen.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionTest {
	transient int i;// 不会被序列化
	volatile int j;// 只存在一份，提醒vm不能保存这个变量的私有拷贝，应该和这个变量直接交互,等同于线程同步synchronized

	public static void main(String[] args) {
		int i = 100;
		i |= 6;
		System.out.println(i);
		avArrayList();
		// insertToPost();
		List linkedList = new LinkedList();
		Set set = null;
		Map map = new HashMap();
		TreeMap treeMap = null;
		Collections cols=null;
	}

	public static void avArrayList() {
		List<Integer> list = new ArrayList<Integer>(5);
		for (int i = 0; i < 5; i++) {
			list.add(i);
		}
		System.out.println("push to list:" + list);
	}

	public static void insertToPost() {
		List<Integer> list = new ArrayList<Integer>(5);

		list.add(0, 0);
		list.add(1, 1);
		list.add(3, 3);
		list.add(0, 0);
		list.add(2, 2);
		System.out.println("insert to list:" + list);
	}

}
