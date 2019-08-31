package com.wzq.text;

import com.wzq.dao.IProductDao;
import com.wzq.model.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.core.io.Resource;

import java.io.InputStream;
import java.util.List;

/**
 * 测试数据库
 *
 * 配置sql.XML的时候测试
 */
public class DaoTest {
//    @Test
//    public void test() throws Exception {
//        //加载配置文件
//        InputStream io = Resources.getResourceAsStream("applicationContext.xml");
//        //获取配置工厂
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(io);
//
//        //获取session对象
//        SqlSession sqlSession = factory.openSession();
//
//        //获取dao代理对象
//        IProductDao dao = sqlSession.getMapper(IProductDao.class);
//
//        //调用dao方法
//        List<Product> all = dao.findAll(1,4);
//        //关闭资源
//        sqlSession.close();
//        io.close();
//
//
//    }
}
