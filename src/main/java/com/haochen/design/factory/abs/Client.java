package com.haochen.design.factory.abs;

public class Client {

	public static void main(String[] args) {
		AbstractFactory bmwFactory = new BMWFactory();
		Tire bTire = bmwFactory.createTire();
		Sedan iSedan = bmwFactory.createSedan();

		bTire.run();
		iSedan.lean();

		AbstractFactory benzFactory = new BenzFactory();
		Tire mTire = benzFactory.createTire();
		Sedan cSedan = benzFactory.createSedan();

		mTire.run();
		cSedan.lean();
	}

}
