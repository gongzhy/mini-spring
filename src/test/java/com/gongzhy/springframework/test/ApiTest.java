package com.gongzhy.springframework.test;

import com.gongzhy.springframework.beans.factory.config.BeanDefinition;
import com.gongzhy.springframework.beans.factory.BeanFactory;
import com.gongzhy.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.gongzhy.springframework.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
//        beanFactory.registerSingleton("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取 bean from Singleton
//        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
//        userService_singleton.queryUserInfo();
    }
}
