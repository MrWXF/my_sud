package com.wzq.service.impl;

import com.github.pagehelper.PageHelper;
import com.wzq.dao.IProductDao;
import com.wzq.model.Product;
import com.wzq.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service("productService")
@Transactional
public class IProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;

    public List<Product> findAll(int page,int size) throws Exception {
//        pageNum是页码值 pageSize是每页显示条数（）必须写在真正查询语句的上一句
        PageHelper.startPage(page,size);
        return productDao.findAll();
    }

    public void save(Product product) throws Exception {
        productDao.save(product);

    }
}
