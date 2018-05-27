package com.study.func;

import com.study.product.Huawei;
import com.study.product.Mobile;

/**
 * 华为手机工厂
 *
 * @author Yuan XingCheng
 * @version V1.0
 * @date 2018-05-27
 * @since jdk1.7
 */
public class HuaweiFactory implements Factory {

    @Override
    public Mobile getMobile() {
        return new Huawei();
    }

}
