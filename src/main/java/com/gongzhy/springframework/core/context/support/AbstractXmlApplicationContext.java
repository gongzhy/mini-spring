package com.gongzhy.springframework.core.context.support;

import com.gongzhy.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.gongzhy.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @description 抽象基类 XML 上下文 Convenient base class for {@link com.gongzhy.springframework.core.context.ApplicationContext}
 * implementations, drawing configuration from XML documents containing bean definitions
 * understood by an {@link com.gongzhy.springframework.beans.factory.xml.XmlBeanDefinitionReader}.
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();

}
