package co.com.ias.config;

import com.mongodb.MongoClientURI;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@RequiredArgsConstructor
@EnableMongoRepositories
public class MongoDbConfig {

    @Autowired
    private Environment env;


    @Bean
    public MongoDbFactory mongoDbFactory(){
        return new SimpleMongoClientDbFactory(String.valueOf(new MongoClientURI(env.getProperty("spring.data.mongodb.uri"))));
    }

    @Bean
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(mongoDbFactory());
    }
}
