package com.gongzhy.springframework.test;

import com.gongzhy.springframework.BeanDefinition;
import com.gongzhy.springframework.BeanFactory;
import com.gongzhy.springframework.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1. 初始化 Factory接口
        BeanFactory beanFactory = new BeanFactory();
        // 2. 注册Bean对象
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3. 获取Bean对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
