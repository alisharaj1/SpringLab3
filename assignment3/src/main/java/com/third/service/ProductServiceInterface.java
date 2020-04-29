package com.third.service;

import java.util.List;

import com.third.entity.Product;

public interface ProductServiceInterface {
	public Product save(Product product);

	public List<Product> fetch();

}
