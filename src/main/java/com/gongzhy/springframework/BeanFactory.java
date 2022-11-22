package com.gongzhy.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 代表Bean对象的工厂，可以将Bean对象的定义存储到Map中以变获取Bean对象
 *
 */
public class BeanFactory {
    // TODO 为什么要使用ConcurrentHashMap
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
