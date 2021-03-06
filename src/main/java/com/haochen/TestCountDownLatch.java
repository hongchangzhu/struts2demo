package com.haochen;

import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {
	private static final int N = 10;

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch doneSignal = new CountDownLatch(N);
		CountDownLatch startSignal = new CountDownLatch(1);// 开始执行信号

		for (int i = 1; i <= N; i++) {
			new Thread(new Worker(i, doneSignal, startSignal)).start();// 线程启动了
		}
		System.out.println("begin------------");
		startSignal.countDown();// 开始执行啦
		System.out.println("开始信号计数完成");
		doneSignal.await();// 等待所有的线程执行完毕,doneSignal中的线程数为0时才执行下面的程序
		System.out.println("Ok");
		// Collections.synchronizedMap(null);
		// ConcurrentHashMap chm;
	}

	static class Worker implements Runnable {
		private final CountDownLatch doneSignal;
		private final CountDownLatch startSignal;
		private int beginIndex;

		Worker(int beginIndex, CountDownLatch doneSignal, CountDownLatch startSignal) {
			this.startSignal = startSignal;
			this.beginIndex = beginIndex;
			this.doneSignal = doneSignal;
		}

		public void run() {
			try {
				startSignal.await(); // 等待开始执行信号的发布
				beginIndex = (beginIndex - 1) * 10 + 1;
				for (int i = beginIndex; i <= beginIndex + 10; i++) {
					System.out.println(i);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				doneSignal.countDown();
			}
		}
	}
}