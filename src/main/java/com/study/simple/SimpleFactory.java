package com.study.simple;

import com.study.product.Apple;
import com.study.product.Huawei;
import com.study.product.Mobile;

/**
 * 简单工厂
 *
 * @author Yuan XingCheng
 * @version V1.0
 * @date 2018-05-27
 * @since jdk1.7
 */
public class SimpleFactory {

    /**
     * 获取手机实例
     * @param name 手机类型名称
     * @return
     */
    public Mobile getMobile(String name){
        if ("苹果".equals(name)) {
            return new Apple();
        }
        if ("华为".equals(name)) {
            return new Huawei();
        }
        return null;
    }

}
