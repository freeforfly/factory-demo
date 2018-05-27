package com.study.abstr;

import com.study.func.AppleFactory;
import com.study.func.HuaweiFactory;
import com.study.product.Apple;
import com.study.product.Huawei;
import com.study.product.Mobile;

/**
 * 抽象工厂实现类
 *
 * @author Yuan XingCheng
 * @version V1.0
 * @date 2018-05-27
 * @since jdk1.7
 */
public class MobileFactory extends AbstractFactory {

    @Override
    public Mobile getApple() {
//        return new AppleFactory().getMobile();
        return new Apple();
    }

    @Override
    public Mobile getHuawei() {
//        return new HuaweiFactory().getMobile();
        return new Huawei();
    }

}
