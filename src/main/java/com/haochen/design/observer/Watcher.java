package com.haochen.design.observer;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {
	private String name;

	public Watcher(Watched w, String name) {
		w.addObserver(this);
		this.name = name;
	}

	public void update(Observable ob, Object arg) {
		System.out.println("Watcher:" + name + ". Data has been changed to: '" + ((Watched) ob).retrieveData() + "'");
	}

}
