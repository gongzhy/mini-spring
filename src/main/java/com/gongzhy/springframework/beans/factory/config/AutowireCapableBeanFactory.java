package com.gongzhy.springframework.beans.factory.config;


import com.gongzhy.springframework.beans.factory.BeanFactory;

/**
 * @description Extension of the {@link com.gongzhy.springframework.beans.factory.BeanFactory}
 * interface to be implemented by bean factories that are capable of
 * autowiring, provided that they want to expose this functionality for
 * existing bean instances.
 * @date 2022/3/9
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
}
