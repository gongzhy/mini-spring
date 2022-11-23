package com.gongzhy.springframework.beans.factory.support;

import com.gongzhy.springframework.beans.factory.config.BeanDefinition;

/**
 * @description Bean 定义注册接口
 * @date 2022/03/07
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName       Bean 名称
     * @param beanDefinition Bean 定义
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}