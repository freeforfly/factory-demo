package com.study.func;

import com.study.product.Apple;
import com.study.product.Mobile;

/**
 * 苹果手机工厂
 *
 * @author Yuan XingCheng
 * @version V1.0
 * @date 2018-05-27
 * @since jdk1.7
 */
public class AppleFactory implements Factory {

    @Override
    public Mobile getMobile() {
        return new Apple();
    }

}
