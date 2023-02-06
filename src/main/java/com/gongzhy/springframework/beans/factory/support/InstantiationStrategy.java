package com.gongzhy.springframework.beans.factory.support;


import com.gongzhy.springframework.core.excption.BeansException;
import com.gongzhy.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @description Bean 实例化策略接口
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
