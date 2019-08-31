package com.wzq.text;

import com.wzq.model.Product;
import com.wzq.service.IProductService;
import com.wzq.service.impl.IProductServiceImpl;
import com.wzq.utils.DataUtils;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class ServiceTest {
//    @Test
//    public void test1() throws Exception {
////        加载配置文件
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//
////        调用方法
//        IProductServiceImpl ps  = (IProductServiceImpl) ac.getBean("productService");
//
////        时间转换
//        String time1 = "2019-22-11 19:22";
//
//        Date date = DataUtils.string2Date(time1, "yyyy-MM-DD HH:mm");
//        //模型赋值
//        Product product = new Product();
//        product.setId(1);
//        product.setProductNum("001");
//        product.setCityName("贵阳");
//        product.setProductName("好玩");
//        product.setDepartureTime(date);
//        product.setProductPrice(300.00);
//        product.setProductStatusStr("三日游");
//        ps.save(product);
//
////        运行方法
//        try {
//
//
//
//            System.out.println(ps.findAll(1,4));
//            System.out.println();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
