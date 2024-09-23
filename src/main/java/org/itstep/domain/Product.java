package org.itstep.domain;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Product {
    private Integer id;
    private String name;
    private String sku;
}
