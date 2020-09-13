package com.quiz.sample;

import com.quiz.beanframework.BeanContext;
import com.quiz.beanframework.BeanFramework;

public class Runner {
    public static void main(String[] args) {
        BeanFramework.run("com.quiz.sample");

        BeanContext beanContext = BeanFramework.getContext();
        FirstService firstService = beanContext.getBeanForType(FirstService.class);

        if (firstService == null) {
            System.out.println("Autowiring not working");
        }

        System.out.println("Finished");
    }
}
