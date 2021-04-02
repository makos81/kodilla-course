package com.kodilla.patterns2.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WatcherAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherAspect.class);

    @Before("execution(* com.kodilla.patterns2.api.OrderFacade.processOrder(..))" +
            "&& args(order, userId)")
    public void logEvent(OrderDto order, final Long userId){
        LOGGER.info("Logging the event of OrderDto: " + order + " userId: " + userId);
    }
}
