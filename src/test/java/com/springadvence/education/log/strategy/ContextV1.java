package com.springadvence.education.log.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContextV1 {
    private Strategy strategy;

    public ContextV1(Strategy strategy){
        this.strategy = strategy;
    }

    public void excute(){
       long startTimeMs = System.currentTimeMillis();

       strategy.call();

       long endTimeMs = System.currentTimeMillis();
       long resultTimeMs = endTimeMs - startTimeMs;
       log.info("resultTimeMs = {}", resultTimeMs);


    }

}
