package com.study.func;

import com.study.product.Mobile;

/**
 * 工厂接口
 *
 * @author Yuan XingCheng
 * @version V1.0
 * @date 2018-05-27
 * @since jdk1.7
 */
public interface Factory {

    /**
     * 获取mobile实例
     * @return
     */
    public Mobile getMobile();

}
