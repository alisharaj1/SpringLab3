package com.third.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.third.dao.ProductDao;
import com.third.entity.Product;
@SuppressWarnings("unused")
@Service
public class ProductService implements ProductServiceInterface{
	@Autowired
	ProductDao productDao;

	@Override
	public Product save(Product product) {
		boolean result = productDao.create(product);

		if (result==true) {
			return product;
		}
		else
			return null;
	}

	@Override
	public List<Product> fetch() {
		return productDao.fetch();
	}
}
