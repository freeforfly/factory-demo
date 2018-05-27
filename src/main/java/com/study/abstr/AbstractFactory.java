package com.study.abstr;

import com.study.product.Apple;
import com.study.product.Mobile;

/**
 * 抽象工厂
 *
 * @author Yuan XingCheng
 * @version V1.0
 * @date 2018-05-27
 * @since jdk1.7
 */
public abstract class AbstractFactory {



    public abstract Mobile getApple();

    public abstract Mobile getHuawei();


}
