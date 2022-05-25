package chuyashkou.collections.additionalTasks.task2.dao;

import chuyashkou.collections.additionalTasks.task2.model.Product;

import java.util.Map;

public interface ProductDao {

    Map<Long, Product> getAllProducts();

    Product addNewProduct (Product product);

    Product deleteProduct(Long id);
}
