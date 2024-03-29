package com.gongzhy.springframework.beans.factory.support;


import com.gongzhy.springframework.core.io.DefaultResourceLoader;
import com.gongzhy.springframework.core.io.ResourceLoader;

/**
 * @description Abstract base class for bean definition readers which implement
 * the {@link com.gongzhy.springframework.beans.factory.support.BeanDefinitionReader} interface.
 * @date 2022/3/9
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

}
