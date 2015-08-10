package com.haochen.design.factory.sample;

import com.haochen.design.factory.CarProduct;
import com.haochen.design.factory.Product;
import com.haochen.design.factory.TructProduct;

public class ProductFactory {
	public static Product createProduct(String name) throws Exception {
		System.out.println("生产" + name + "的工厂方法工厂类");
		if ("car".equals(name)) {
			return new CarProduct();
		} else if ("truct".equals(name)) {
			return new TructProduct();
		} else {
			throw new Exception("在产品工厂内找不到对应的产品实现类.");
		}
	}
}
