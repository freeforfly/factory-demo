package com.study.func;

/**
 * 工厂方法模式测试
 *
 * @author Yuan XingCheng
 * @version V1.0
 * @date 2018-05-27
 * @since jdk1.7
 */
public class FactoryTest {

    public static void main(String[] args) {
        Factory factory = new AppleFactory();
        System.out.println(factory.getMobile());

        factory = new HuaweiFactory();
        System.out.println(factory.getMobile());
    }

}
