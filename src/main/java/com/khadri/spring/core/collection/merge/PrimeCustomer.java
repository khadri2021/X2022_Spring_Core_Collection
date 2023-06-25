package com.khadri.spring.core.collection.merge;

import java.util.Properties;

public class PrimeCustomer extends  Customer{
    private Properties order;

    @Override
    public Properties getOrder() {
        return order;
    }

    @Override
    public void setOrder(Properties order) {
        this.order = order;
    }
}
