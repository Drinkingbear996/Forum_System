package com.hwc.demonowcoder.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary//如果有多个相同TestDao，优先装配此bean
public class TestDaoMybatisImpl implements TestDao{
    @Override
    public String select() {
        return "Mybatis";
    }
}
