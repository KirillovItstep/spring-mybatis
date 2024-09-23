package org.itstep.repository;

import org.apache.ibatis.annotations.Mapper;
import org.itstep.domain.Stock;
import org.itstep.domain.Warehouse;

import java.util.List;

@Mapper
public interface StockRepository {

    List<Stock> findStockByWarehouse(Warehouse warehouse);

    void save(Stock stock);
}