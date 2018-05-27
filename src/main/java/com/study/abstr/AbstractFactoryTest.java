package com.study.abstr;

import com.study.product.Mobile;

/**
 * 抽象工厂测试
 *
 * @author Yuan XingCheng
 * @version V1.0
 * @date 2018-05-27
 * @since jdk1.7
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        MobileFactory factory = new MobileFactory();
        System.out.println(factory.getApple());
        System.out.println(factory.getHuawei());
    }

}
