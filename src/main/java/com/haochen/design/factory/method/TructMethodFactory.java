package com.haochen.design.factory.method;

import com.haochen.design.factory.Product;
import com.haochen.design.factory.TructProduct;

public class TructMethodFactory implements MethodFactory {

	@Override
	public Product createProduct() {
		return new TructProduct();
	}

}
