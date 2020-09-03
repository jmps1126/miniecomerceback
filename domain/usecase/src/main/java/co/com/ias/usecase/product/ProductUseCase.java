package co.com.ias.usecase.product;

import co.com.ias.model.product.Product;
import co.com.ias.model.product.gateway.IProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductUseCase {

    private final IProductRepository iProductRepository;

    public List<Product> findAll(){
        return iProductRepository.findAll();
    }
}
