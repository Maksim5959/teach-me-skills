package com.chuyashkou.collections.additional_tasks.task2.service.impl;

import com.chuyashkou.collections.additional_tasks.task2.dao.ProductDao;
import com.chuyashkou.collections.additional_tasks.task2.dao.impl.ProductDaoImpl;
import com.chuyashkou.collections.additional_tasks.task2.model.Product;
import com.chuyashkou.collections.additional_tasks.task2.service.ProductService;

import java.util.*;

public class ProductServiceImpl implements ProductService {

    private static final String REGEX_FOR_ID_VALIDATIONS = "\\d+";
    private static final String REGEX_FOR_PRICE_VALIDATIONS = "(\\d+([.])\\d+|\\d+)";
    private final ProductDao productDao = new ProductDaoImpl();

    @Override
    public void getAllProductsByPriceUp() {
        Set<Product> productsByPrice = new TreeSet<>(Comparator.comparingDouble(Product::getPrice));
        productsByPrice.addAll(productDao.getAllProducts().values());
        productsByPrice.forEach(System.out::println);
    }

    @Override
    public void getAllProductsByPriceDown() {
        TreeSet<Product> productsByPrice = new TreeSet<>(Comparator.comparingDouble(Product::getPrice));
        productsByPrice.addAll(productDao.getAllProducts().values());
        Iterator<Product> iterator = productsByPrice.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Override
    public void getAllProductsByAdding() {
        LinkedList<Product> reverse = new LinkedList<>(productDao.getAllProducts().values());
        Iterator<Product> iterator = reverse.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Override
    public void addNewProduct(String[] productFields) {
        if (isInvalidEnterFormat(productFields) || isInvalidIdFormat(productFields[0]) || isInvalidPriceFormat(productFields[2])) {
            return;
        } else if (isCloneProduct(productDao.getAllProducts(), productFields[0])) {
            System.out.println("Товар с таким ID уже существует.");
            return;
        }
        if (productDao.addNewProduct(parseToProduct(productFields)) == null) {
            System.out.println("Товар добавлен.");
        }
    }

    @Override
    public void deleteProduct(String productId) {
        if (isInvalidIdFormat(productId)) {
            return;
        } else if (!isCloneProduct(productDao.getAllProducts(), productId.strip())) {
            System.out.println("Товар с таким id не найден.");
            return;
        }
        Product product = productDao.deleteProduct(Long.parseLong(productId.strip()));
        if (product != null) {
            System.out.printf("Товар %s удален.\n", product);
        } else {
            System.out.println("Товар не удален.");
        }
    }

    @Override
    public void updateProduct(String[] productFields) {
        if (isInvalidEnterFormat(productFields) || isInvalidIdFormat(productFields[0]) || isInvalidPriceFormat(productFields[2])) {
            return;
        } else if (!isCloneProduct(productDao.getAllProducts(), productFields[0].strip())) {
            System.out.println("Товар с таким id не найден.");
            return;
        }
        Product newProduct = parseToProduct(productFields);
        Product oldProduct = productDao.addNewProduct(newProduct);
        if (oldProduct != null) {
            System.out.printf("Товар %s отредактирован, обнавленный товар - %s.\n", oldProduct, newProduct);
        } else {
            System.out.println("Товар не отредактирован.");
        }
    }

    private boolean isInvalidEnterFormat(String[] productFields) {
        if (productFields.length != 3) {
            System.out.println("Неверный формат ввода.");
            return true;
        }
        return false;
    }

    private boolean isInvalidIdFormat(String id) {
        if (!id.strip().matches(REGEX_FOR_ID_VALIDATIONS)) {
            System.out.println("ID введен неверно.");
            return true;
        }
        return false;
    }

    private boolean isInvalidPriceFormat(String price) {
        if (!price.strip().matches(REGEX_FOR_PRICE_VALIDATIONS)) {
            System.out.println("Цена введена неверно.");
            return true;
        }
        return false;
    }

    private boolean isCloneProduct(Map<Long, Product> products, String id) {
        return products.containsKey(Long.parseLong(id.strip()));
    }

    private Product parseToProduct(String[] productFields) {
        long productId = Long.parseLong(productFields[0].strip());
        String productName = productFields[1].toUpperCase().strip();
        double productPrice = Double.parseDouble(productFields[2].strip());
        return new Product(productId, productName, productPrice);
    }
}
