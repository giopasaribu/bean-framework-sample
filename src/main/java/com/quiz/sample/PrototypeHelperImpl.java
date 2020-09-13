package com.quiz.sample;

import com.quiz.beanframework.annotation.Bean;
import com.quiz.beanframework.bean.BeanScope;

@Bean(scope = BeanScope.PROTOTYPE)
public class PrototypeHelperImpl implements PrototypeHelper {

    public PrototypeHelperImpl() {
        System.out.println("Prototype Helper created");
    }
}
