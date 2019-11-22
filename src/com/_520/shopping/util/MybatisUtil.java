package com._520.shopping.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {

    private static SqlSessionFactory factory;

    static {

        try {
            // 加载资源文件
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            // 获取SqlSessionFactory对象，用来创建session
            factory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static SqlSession getSession(){
        // 默认不自动提交事务
        return factory.openSession();
    }

    public static <T>T getMapper(Class<T> aclass){
        return getSession().getMapper(aclass);
    }
}
