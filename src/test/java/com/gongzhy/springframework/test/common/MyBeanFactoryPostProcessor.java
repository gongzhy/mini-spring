package com.gongzhy.springframework.test.common;

import com.gongzhy.springframework.beans.PropertyValue;
import com.gongzhy.springframework.beans.PropertyValues;
import com.gongzhy.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.gongzhy.springframework.beans.factory.config.BeanDefinition;
import com.gongzhy.springframework.beans.factory.config.BeanFactoryPostProcessor;
import com.gongzhy.springframework.core.excption.BeansException;

/**
 * @description BeanFactoryPostProcessor 实例化 Bean 对象之前，修改 BeanDefinition 属性
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}
