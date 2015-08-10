package com.haochen.design.factory;

public class TructProduct implements Product {

	@Override
	public void assemble() {
		System.out.println("卡车组装...............");
	}

}
