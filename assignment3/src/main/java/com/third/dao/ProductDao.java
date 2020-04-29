package com.third.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.third.entity.Product;

@Transactional
@Repository
public class ProductDao implements ProductInterface {
	@PersistenceContext
	EntityManager e;

	@Override
	public boolean create(Product product) {
		e.persist(product);
		return true;
	}

	@Override
	public List<Product> fetch() {
		String QueryStr = "SELECT product FROM Product product";
		TypedQuery<Product> query = e.createQuery(QueryStr, Product.class);

		return query.getResultList();
	}

}
