package com.haochen.design.factory.sample;

import com.haochen.design.factory.Product;

public class Client {
	private static Product car, truct;

	public static void main(String[] args) throws Exception {
		car = ProductFactory.createProduct("car");
		car.assemble();

		truct = ProductFactory.createProduct("truct");
		truct.assemble();
	}

}
