package com.quiz.sample;

import com.quiz.beanframework.annotation.AutowireBean;
import com.quiz.beanframework.annotation.Bean;

@Bean
public class FirstServiceImpl implements FirstService {

    @AutowireBean private TestRepository testRepository;

    @AutowireBean private PrototypeHelper prototypeHelper;

    public FirstServiceImpl() {
        System.out.println("First Service created");
    }
}
