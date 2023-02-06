package com.gongzhy.springframework.test;

import com.gongzhy.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.gongzhy.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.gongzhy.springframework.core.context.support.ClassPathXmlApplicationContext;
import com.gongzhy.springframework.test.bean.UserService;
import com.gongzhy.springframework.test.common.MyBeanFactoryPostProcessor;
import com.gongzhy.springframework.test.common.MyBeanPostProcessor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {


    @Test
    public void test_BeanFactoryPostProcessorAndBeanPostProcessor() {

        log.info("1.初始化 BeanFactory");

        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        log.info("2.读取配置文件&注册Bean");
        // 2. 读取配置文件&注册Bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        log.info("3.BeanDefinition 加载完成 & Bean实例化之前，修改 BeanDefinition 的属性值");
        // 3. BeanDefinition 加载完成 & Bean实例化之前，修改 BeanDefinition 的属性值
        MyBeanFactoryPostProcessor beanFactoryPostProcessor = new MyBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);

        log.info("4.Bean实例化之后，修改 Bean 属性信息");
        // 4. Bean实例化之后，修改 Bean 属性信息
        MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);

        log.info("5.获取Bean对象调用方法");
        // 5. 获取Bean对象调用方法
        UserService userService = beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springPostProcessor.xml");

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }
}
