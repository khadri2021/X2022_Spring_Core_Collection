package com.khadri.spring.core.collection.merge;

import java.util.Properties;

public abstract  class Customer {
  private Properties order;

    public Properties getOrder() {
        return order;
    }

    public void setOrder(Properties order) {
        this.order = order;
    }
}
