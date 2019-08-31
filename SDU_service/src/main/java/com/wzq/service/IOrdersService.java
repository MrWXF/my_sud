package com.wzq.service;

import com.wzq.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface IOrdersService {

    public Orders findAll(String id) throws Exception;
}
