package com.gongzhy.springframework.beans.factory;

import com.gongzhy.springframework.beans.BeansException;

/**
 * 代表Bean对象的工厂，可以将Bean对象的定义存储到Map中以变获取Bean对象
 */
public interface BeanFactory {
    /**
     * 返回 Bean 的实例对象
     *
     * @param name 要检索的bean的名称
     * @return 实例化的 Bean 对象
     * @throws BeansException 不能获取 Bean 对象，则抛出异常
     */
    Object getBean(String name) throws BeansException;
}
