package com.haochen.design.factory.method;

import com.haochen.design.factory.CarProduct;
import com.haochen.design.factory.Product;

public class CarMethodFactory implements MethodFactory {

	@Override
	public Product createProduct() {
		return new CarProduct();
	}

}
