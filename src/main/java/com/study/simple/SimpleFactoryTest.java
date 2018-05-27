package com.study.simple;

import com.study.product.Apple;
import com.study.product.Huawei;
import com.study.product.Mobile;

/**
 * 简单工厂模式测试
 *
 * @author Yuan XingCheng
 * @version V1.0
 * @date 2018-05-27
 * @since jdk1.7
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getMobile("苹果"));
        System.out.println(factory.getMobile("华为"));
    }

}
