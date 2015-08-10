package com.haochen.design.observer;

public class TestMain {
	private static Watched watched;

	// static private Observer watcher;

	public static void main(String[] args) {
		watched = new Watched();

		new Watcher(watched, "w1");
		new Watcher(watched, "w2");

		watched.changeData("In C, we create bugs.");
		watched.changeData("In Java, we inherit bugs.");
		watched.changeData("In Java, we inherit bugs.");
		watched.changeData("In Visual Basic, we visualize bugs.");
	}

}
