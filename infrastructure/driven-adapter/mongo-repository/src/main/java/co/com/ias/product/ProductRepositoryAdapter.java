package co.com.ias.product;

import co.com.ias.AdapterOperation;
import co.com.ias.model.product.Product;
import co.com.ias.model.product.gateway.IProductRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryAdapter extends AdapterOperation<Product,ProductData,String, IProductDataRepository> implements IProductRepository {

    public ProductRepositoryAdapter(IProductDataRepository repository, ObjectMapper mapper){
        super(repository, mapper, d -> mapper.mapBuilder(d, Product.ProductBuilder.class).build());
    }

    @Override
    public List<Product> findAll() {
        return super.findAll();
    }

    @Override
    public Product findById(String id) {
        return super.findById(id);
    }

    @Override
    public Product create(Product product) {
        return super.save(product);
    }

    @Override
    public void deleteById(String id) {
        super.delete(id);
    }
}
