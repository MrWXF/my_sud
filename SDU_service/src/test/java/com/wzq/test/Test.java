package com.wzq.test;


import com.wzq.model.Product;
import com.wzq.service.IProductService;
import com.wzq.service.impl.IProductServiceImpl;

import java.util.List;

public class Test {
    @org.junit.Test
    public void test(){
        Product product = new Product();

        IProductService productService = new IProductServiceImpl();

        try {
            List<Product> all = productService.findAll(1,5);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
