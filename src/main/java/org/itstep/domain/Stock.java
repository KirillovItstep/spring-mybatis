package org.itstep.domain;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Stock {
    private Product product;
    private Warehouse warehouse;
    private int count;
}
