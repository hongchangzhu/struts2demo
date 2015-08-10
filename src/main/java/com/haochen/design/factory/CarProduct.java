package com.haochen.design.factory;

public class CarProduct implements Product {

	@Override
	public void assemble() {
		System.out.println("轿车组装...............");
	}

}
