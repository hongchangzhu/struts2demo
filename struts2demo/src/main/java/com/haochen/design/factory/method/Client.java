package com.haochen.design.factory.method;

import com.haochen.design.factory.Product;

public class Client {
	private static Product car, truct;
	private static MethodFactory carFactory, tructFactory;

	public static void main(String[] args) {
		carFactory = new CarMethodFactory();
		car = carFactory.createProduct();
		car.assemble();

		tructFactory = new TructMethodFactory();
		truct = tructFactory.createProduct();
		truct.assemble();
	}

}
