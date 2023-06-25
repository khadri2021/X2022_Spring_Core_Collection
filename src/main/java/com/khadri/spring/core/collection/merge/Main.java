package com.khadri.spring.core.collection.merge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_merge.xml");

        Customer cust = context.getBean("primeCust", PrimeCustomer.class);
        System.out.println(cust.getOrder());
    }
}
