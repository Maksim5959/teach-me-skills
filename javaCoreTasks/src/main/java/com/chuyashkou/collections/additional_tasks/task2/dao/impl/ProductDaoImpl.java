package com.chuyashkou.collections.additional_tasks.task2.dao.impl;

import com.chuyashkou.collections.additional_tasks.task2.dao.ProductDao;
import com.chuyashkou.collections.additional_tasks.task2.model.Product;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProductDaoImpl implements ProductDao {

    private final Map<Long, Product> products = new LinkedHashMap<>();

    @Override
    public Map<Long, Product> getAllProducts() {
        return products;
    }

    @Override
    public Product addNewProduct(Product product) {
        return products.put(product.getId(), product);
    }

    @Override
    public Product deleteProduct(Long id) {
        return products.remove(id);
    }
}
