package co.com.ias.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "adapters.mongodb")
public class MongoCredentials {

    private static final String CON_FORMAT = "%s://%s:%s@%s:%s";

    String database;
    String username;
    String password;
    String hostname;
    String protocol;
    String port;

    public String getUri(){
        return String.format(CON_FORMAT, protocol, username, password, hostname, port);
    }
}
