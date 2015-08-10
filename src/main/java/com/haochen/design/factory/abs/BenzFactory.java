package com.haochen.design.factory.abs;

//奔驰汽车使用米其林轮胎和中国产座椅组装汽车的工厂
public class BenzFactory implements AbstractFactory {

	@Override
	public Tire createTire() {
		return new MichelinTire();
	}

	@Override
	public Sedan createSedan() {
		return new ChinaSedan();
	}

}
