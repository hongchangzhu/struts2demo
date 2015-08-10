package com.haochen.design.factory.abs;

//宝马汽车使用普利司通轮胎和印度产座椅组装汽车的工厂
public class BMWFactory implements AbstractFactory {

	@Override
	public Tire createTire() {
		return new BridgestoneTire();
	}

	@Override
	public Sedan createSedan() {
		return new IndiaSedan();
	}

}
