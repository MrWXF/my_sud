package com.wzq.dao;

import com.wzq.model.Orders;
import org.apache.ibatis.annotations.Select;

public interface IOrdersDao {
    @Select("")
    public Orders findAll(String id) throws Exception;
}
