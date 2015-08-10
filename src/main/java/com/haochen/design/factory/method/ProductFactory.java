package com.haochen.design.factory.method;

import com.haochen.design.factory.CarProduct;
import com.haochen.design.factory.Product;
import com.haochen.design.factory.TructProduct;

public class ProductFactory {
	public static Product createCarProduct() {
		return new CarProduct();
	}

	public static Product createTructProduct() {
		return new TructProduct();
	}
}
