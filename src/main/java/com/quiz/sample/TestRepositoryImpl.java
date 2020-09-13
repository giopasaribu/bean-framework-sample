package com.quiz.sample;

import com.quiz.beanframework.annotation.AutowireBean;
import com.quiz.beanframework.annotation.Bean;

@Bean
public class TestRepositoryImpl implements TestRepository {

    @AutowireBean private PrototypeHelper prototypeHelper;

    public TestRepositoryImpl() {
        System.out.println("Test Repository created");
    }
}
