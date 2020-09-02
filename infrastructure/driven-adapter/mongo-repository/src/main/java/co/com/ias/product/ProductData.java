package co.com.ias.product;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "product")
@Builder(toBuilder = true)
public class ProductData {

    @Id
    private String id;
    private String name;
    private String description;
    private Double basePrice;
    private Double taxRate;
    private String productState;
    private Integer inventoryQuantity;
}
