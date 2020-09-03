package co.com.ias.config;

import org.reactivecommons.utils.ObjectMapper;
import org.reactivecommons.utils.ObjectMapperImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapperImp();
    }
}
