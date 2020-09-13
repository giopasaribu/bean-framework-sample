package com.quiz.sample;

import com.quiz.beanframework.annotation.AutowireBean;
import com.quiz.beanframework.annotation.Bean;

@Bean
public class SecondServiceImpl implements SecondService {

    @AutowireBean private TestRepository testRepository;

    public SecondServiceImpl() {
        System.out.println("Second service created");
    }
}
