package com.kodilla.lifecycle;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanMonitorLogger implements BeanPostProcessor {

    private static final Logger logger = LogManager.getLogger(BeanMonitorLogger.class);

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.log(Level.INFO, "The bean \"" + beanName + "\" was initialized.");
        return bean;
    }
}
