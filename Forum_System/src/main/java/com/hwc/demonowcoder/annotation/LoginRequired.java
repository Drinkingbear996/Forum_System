package com.hwc.demonowcoder.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
/**
 * 标记未登录时要拦截的路径访问方法
 */
public @interface LoginRequired {
}
