package com.chuyashkou.collections.additional_tasks.task2.dao;

import com.chuyashkou.collections.additional_tasks.task2.model.Product;

import java.util.Map;

public interface ProductDao {

    Map<Long, Product> getAllProducts();

    Product addNewProduct (Product product);

    Product deleteProduct(Long id);
}
