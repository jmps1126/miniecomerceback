package co.com.ias.model.product.gateway;

import co.com.ias.model.product.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> findAll();
    Product findById(String id);
    Product create(Product product);
    void deleteById(String id);

}
