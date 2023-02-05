package com.gongzhy.springframework.beans.factory.config;


import com.gongzhy.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * @description Configuration interface to be implemented by most bean factories. Provides
 * facilities to configure a bean factory, in addition to the bean factory
 * client methods in the {@link com.gongzhy.springframework.beans.factory.BeanFactory}
 * interface.
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
