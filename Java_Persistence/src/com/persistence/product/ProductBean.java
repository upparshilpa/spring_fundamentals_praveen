package com.persistence.product;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class ProductBean {
	@PersistenceContext(unitName = "JPATest-ejbPU")
	private EntityManager em;
	
	public List<ProductEntity> getAllProducts(){
		List<ProductEntity> productList = null;
		
		productList =(List<ProductEntity>) em.createQuery("select p from ProductEntity p").getResultList();
		
		return productList;
	}
}
