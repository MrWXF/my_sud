package com.wzq.service.impl;

import com.wzq.dao.IOrdersDao;
import com.wzq.model.Orders;
import com.wzq.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IOrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    public Orders findAll(String id) throws Exception {
        Orders ordersDaoAll = ordersDao.findAll(id);

        return ordersDaoAll;
    }

    public void test(){
        int a = 0;
    }
}
