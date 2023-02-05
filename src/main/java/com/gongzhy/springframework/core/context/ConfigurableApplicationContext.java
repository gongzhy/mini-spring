package com.gongzhy.springframework.core.context;


import com.gongzhy.springframework.core.excption.BeansException;

/**
 * @description SPI 接口配置应用上下文 SPI interface to be implemented by most if not all application contexts.
 * Provides facilities to configure an application context in addition
 * to the application context client methods in the
 * {@link com.gongzhy.springframework.core.context.ApplicationContext} interface.
 * @date 2022/3/10
 */
public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

}
