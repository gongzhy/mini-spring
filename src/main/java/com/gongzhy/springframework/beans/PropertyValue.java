package com.gongzhy.springframework.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description Bean 属性信息
 */
@Getter
@AllArgsConstructor
public class PropertyValue {

    /**
     * 属性名称
     */
    private final String name;

    /**
     * 属性值
     */
    private final Object value;
}
