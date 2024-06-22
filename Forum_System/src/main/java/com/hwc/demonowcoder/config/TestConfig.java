package com.hwc.demonowcoder.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;


@Configuration//配置类（配置第三方的bean）
public class TestConfig {

    @Bean//将simpleDateFormat方法返回的对象作为bean放入容器
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
