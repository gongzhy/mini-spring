package com.gongzhy.springframework.beans.factory.support;

import com.gongzhy.springframework.beans.BeansException;
import com.gongzhy.springframework.beans.factory.BeanFactory;
import com.gongzhy.springframework.beans.factory.config.BeanDefinition;

/**
 * @description 抽象的 Bean 工厂基类，定义模板方法
 * @date 2022/03/07
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);

}