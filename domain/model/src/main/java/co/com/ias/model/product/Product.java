package co.com.ias.model.product;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder(toBuilder = true)
public class Product {

    private String id;
    private String name;
    private String description;
    private Double basePrice;
    private Double taxRate;
    private String productState;
    private Integer inventoryQuantity;
}
