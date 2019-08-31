package com.wzq.model;

import java.util.Date;

/**
 * 仓库信息
 */
public class Orders {
    private String id;//编号
    private Date upperDate;
    private String upperDateStr;//上架时间
    private String commName;//商品名称
    private Integer commNum;//商品名称
    private Volume volumeNum;//销量
    private Warehouse warehouse;//仓库
}
