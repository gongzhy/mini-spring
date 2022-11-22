package com.gongzhy.springframework;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 用于定义Bean对象，他的实现方式是以一个Object类型存储对象
 */
@Getter
@AllArgsConstructor
public class BeanDefinition {
    private Object bean;
}
