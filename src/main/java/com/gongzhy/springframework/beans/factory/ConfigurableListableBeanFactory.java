package com.gongzhy.springframework.beans.factory;


import com.gongzhy.springframework.core.excption.BeansException;
import com.gongzhy.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.gongzhy.springframework.beans.factory.config.BeanDefinition;
import com.gongzhy.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @description Configuration interface to be implemented by most listable bean factories.
 * In addition to {@link ConfigurableBeanFactory}, it provides facilities to
 * analyze and modify bean definitions, and to pre-instantiate singletons.
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

}
