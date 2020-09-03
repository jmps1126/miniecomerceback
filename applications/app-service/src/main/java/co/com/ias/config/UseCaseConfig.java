package co.com.ias.config;

import co.com.ias.model.product.gateway.IProductRepository;
import co.com.ias.usecase.product.ProductUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public ProductUseCase productUseCaseBean(IProductRepository iProductRepository){
        return new ProductUseCase(iProductRepository);
    }
}
