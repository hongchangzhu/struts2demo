package com.haochen;

public class ThreadLocalTestDemo {

	public static void main(String[] args) {
		ThreadLocal<Integer> tlocal = new ThreadLocal<Integer>();

		tlocal.set(50);
		System.out.println("value = " + tlocal.get());

		tlocal.remove();
		System.out.println("value = " + tlocal.get());

//		ThreadDemo td = new ThreadDemo();
//		td.test();
//
//		ThreadDemo td2 = new ThreadDemo();
//		td2.test();
	}

}
