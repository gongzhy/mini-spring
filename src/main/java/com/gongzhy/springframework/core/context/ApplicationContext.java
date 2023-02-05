package com.gongzhy.springframework.core.context;


import com.gongzhy.springframework.beans.factory.ListableBeanFactory;

/**
 * @description 应用上下文接口 Central interface to provide configuration for an application.
 * This is read-only while the application is running, but may be
 * reloaded if the implementation supports this.
 * @date 2022/3/10
 */
public interface ApplicationContext extends ListableBeanFactory {
}
