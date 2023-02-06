package com.gongzhy.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description 资源处理接口
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
