package com.gongzhy.springframework.beans.factory.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * 用于定义Bean对象，他的实现方式是以一个Object类型存储对象
 */
@Data
@AllArgsConstructor
public class BeanDefinition {
    private Class beanClass;
}
