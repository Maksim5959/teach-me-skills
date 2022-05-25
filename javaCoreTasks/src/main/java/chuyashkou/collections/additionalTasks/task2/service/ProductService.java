package chuyashkou.collections.additionalTasks.task2.service;

public interface ProductService {

    void getAllProductsByPriceUp();

    void getAllProductsByPriceDown();

    void getAllProductsByAdding();

    void addNewProduct(String [] productFields);

    void deleteProduct(String productId);

    void updateProduct(String [] productFields);
}
