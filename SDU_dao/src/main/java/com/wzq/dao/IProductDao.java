package com.wzq.dao;

import com.wzq.model.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 */

public interface IProductDao {
    /**
     * 查询所有商品信息
     * @return
     * @throws Exception
     */
    @Select("SELECT * FROM product")
    public List<Product> findAll() throws Exception;


     @Select("INSERT INTO product(productNum, productName, cityName,departureTime,productPrice,productStatusStr) VALUES " +
             "(#{productNum}, #{productName}, #{cityName},#{departureTime}, #{productPrice},#{productStatusStr})")

    public void save(Product product)throws Exception;


}
