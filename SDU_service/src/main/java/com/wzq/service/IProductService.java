package com.wzq.service;

import com.wzq.model.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll(int page,int size) throws Exception;

    public void save(Product product) throws Exception;
}
