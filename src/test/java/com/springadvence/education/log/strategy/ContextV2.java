package com.springadvence.education.log.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 전략을 파라미터로 전달 받는다.
 */
@Slf4j
public class ContextV2 {

    public void excute(Strategy strategy){
       long startTimeMs = System.currentTimeMillis();

       strategy.call();

       long endTimeMs = System.currentTimeMillis();
       long resultTimeMs = endTimeMs - startTimeMs;
       log.info("resultTimeMs = {}", resultTimeMs);


    }

}
